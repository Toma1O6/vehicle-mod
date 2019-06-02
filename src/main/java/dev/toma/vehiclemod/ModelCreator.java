package dev.toma.vehiclemod;

public class ModelCreator {
	
	public static void createModels() {
		if(!VehicleMod.isDevEnvironment()) {
			return;
		}
		
		final String username = System.getProperty("user.name");
	}
}
