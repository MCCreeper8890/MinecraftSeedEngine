package mccreeper8890.mcSeedEngine.cmd;

import java.io.IOException;

import mccreeper8890.mcSeedEngine.Main;
import mccreeper8890.mcSeedEngine.io.SystemReader;

public class GenSeed {
	
	public static void call(SystemReader reader) throws IOException {
		System.out.println("How many seeds to generate?");
		int numCycles = Integer.parseInt(reader.readLine());
		int cycle = 0;
		while(true) {
			int randomSeed = (int) (Math.random() * Math.pow(2, 64));
			if (Main.pendingSeeds.contains(randomSeed)) continue;
			if (Main.seeds.contains(randomSeed)) continue;
			System.out.println("On cycle " + cycle + ", generated seed " + randomSeed);
			Main.seeds.add(randomSeed);
			cycle++;
			if (cycle >= numCycles) {
				break;
			}
		}
	}

}
