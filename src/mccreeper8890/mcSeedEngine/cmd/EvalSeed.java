package mccreeper8890.mcSeedEngine.cmd;

import java.io.IOException;

import mccreeper8890.mcSeedEngine.Main;
import mccreeper8890.mcSeedEngine.io.SystemReader;

public class EvalSeed {
	
	public static void call(SystemReader reader) throws IOException {
		int numSeeds = Integer.parseInt(reader.readLine());
		String trash;
		for(int i = 0; i < numSeeds; i++) {
			int seed = Main.pendingSeeds.get(i);
			System.out.println("Seed: " + seed);
			System.out.println("Please generate world, and press ENTER when ready");
			trash = reader.readLine();
			System.out.println("Please explore world, and press ENTER when ready");
			trash = reader.readLine();
			System.out.println("Please enter description");
			String description = reader.readLine();
			Main.pendingSeeds.remove(seed);
			Main.seeds.add(seed);
			Main.descriptions.put(seed, description);
		}
	}

}
