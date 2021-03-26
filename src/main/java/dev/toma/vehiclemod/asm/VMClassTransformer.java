package dev.toma.vehiclemod.asm;

import net.minecraft.launchwrapper.IClassTransformer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.*;

public class VMClassTransformer implements IClassTransformer {

    final Logger log = LogManager.getLogger("vehiclemod-core");

    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        boolean obfuscated = !name.equals(transformedName);
        if (transformedName.equals("net.minecraft.client.renderer.entity.RenderPlayer")) {
            return patchPlayerRender(basicClass, obfuscated);
        }
        return basicClass;
    }

    byte[] patchPlayerRender(byte[] data, boolean isObfuscated) {
        ClassNode node = new ClassNode();
        ClassReader reader = new ClassReader(data);
        reader.accept(node, 0);
        log.info("Patching player render");
        Name m_prepareScale = new Name("func_77041_b", "preRenderCallback");
        String parameters = "(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V";
        boolean patched = false;
        for (MethodNode method : node.methods) {
            if (method.name.equals(m_prepareScale.get(isObfuscated)) && method.desc.equals(parameters)) {
                InsnList insnList = method.instructions;
                boolean foundReturn = false;
                for (int i = insnList.size() - 1; i >= 0; i--) {
                    AbstractInsnNode abstractInsnNode = insnList.get(i);
                    if (abstractInsnNode.getOpcode() == Opcodes.RETURN) {
                        InsnList list = new InsnList();
                        list.add(new VarInsnNode(Opcodes.ALOAD, 1));
                        list.add(new MethodInsnNode(
                                Opcodes.INVOKESTATIC,
                                "dev/toma/vehiclemod/asm/ClientHooks",
                                "playerPreRenderCallback",
                                "(Lnet/minecraft/client/entity/AbstractClientPlayer;)V",
                                false
                        ));
                        insnList.insertBefore(abstractInsnNode, list);
                        log.info("Player render patched successfully");
                        patched = true;
                        break;
                    }
                }
                if (!patched) {
                    log.fatal("Player render patch was unsuccessful");
                }
                break;
            }
        }

        ClassWriter writer = new ClassWriter(0);
        node.accept(writer);
        return writer.toByteArray();
    }

    private static class Name {

        private final String mcp, mapped;

        private Name(String mcp, String mapped) {
            this.mcp = mcp;
            this.mapped = mapped;
        }

        public String get(boolean obf) {
            return obf ? mcp : mapped;
        }
    }
}
