package mccreeper8890.mcSeedEngine.cmd;

import java.io.IOException;

import mccreeper8890.mcSeedEngine.Main;
import mccreeper8890.mcSeedEngine.io.SystemReader;
import mccreeper8890.mcSeedEngine.util.StringUtil;

public class GetSeed {
	
	public static void call(SystemReader reader) throws IOException {
		System.out.println("Enter desscription");
		String[] userDescriptionSplit = reader.readLine().split(" ");
		System.out.println("Searching...");
		for(int i = 0; i < Main.seeds.size(); i++) {
			int seed = Main.seeds.get(i);
			String seedDescription = Main.descriptions.get(seed);
			String[] seedDescriptionSplit = seedDescription.split(" ");
			if (StringUtil.duplicateEntryInArrays(userDescriptionSplit, seedDescriptionSplit)) {
				System.out.println("Seed: " + seed + " : " + seedDescription);
			}
		}
	}

}
