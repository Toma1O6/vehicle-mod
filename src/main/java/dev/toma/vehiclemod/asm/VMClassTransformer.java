package dev.toma.vehiclemod.asm;

import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.*;

import java.util.function.Function;

public class VMClassTransformer implements IClassTransformer {

    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        boolean obfuscated = !name.equals(transformedName);
        if(transformedName.equals("net.minecraft.client.renderer.entity.RenderPlayer")) {
            return patchPlayerRender(basicClass, obfuscated);
        }
        return basicClass;
    }

    byte[] patchPlayerRender(byte[] data, boolean isObfuscated) {
        ClassNode node = new ClassNode();
        ClassReader reader = new ClassReader(data);
        reader.accept(node, 0);

        Name m_preRenderCallback = new Name("func_77041_b", "preRenderCallback");
        String parameters = "(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V";
        itr:
        for (MethodNode method : node.methods) {
            if (method.name.equals(m_preRenderCallback.apply(isObfuscated)) && method.desc.equals(parameters)) {
                InsnList insnList = method.instructions;
                for (int i = insnList.size() - 1; i >= 0; i--) {
                    AbstractInsnNode abstractInsnNode = insnList.get(i);
                    if(abstractInsnNode.getOpcode() == Opcodes.INVOKESTATIC) {
                        InsnList list = new InsnList();
                        list.add(new VarInsnNode(Opcodes.ALOAD, 1));
                        list.add(new MethodInsnNode(
                                Opcodes.INVOKESTATIC,
                                "dev/toma/vehiclemod/asm/ClientHooks",
                                "playerPreRenderCallback",
                                "(Lnet/minecraft/client/entity/AbstractClientPlayer;)V",
                                false
                        ));
                        insnList.insert(abstractInsnNode, list);
                        break itr;
                    }
                }
            }
        }

        ClassWriter writer = new ClassWriter(0);
        node.accept(writer);
        return writer.toByteArray();
    }

    static class Name implements Function<Boolean, String> {

        final String mcp, mapped;

        Name(String mcp, String mapped) {
            this.mcp = mcp;
            this.mapped = mapped;
        }

        @Override
        public String apply(Boolean isObfuscated) {
            return isObfuscated ? mcp : mapped;
        }
    }
}
