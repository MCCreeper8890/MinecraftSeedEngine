package mccreeper8890.mcSeedEngine.cmd;

import java.io.IOException;

import mccreeper8890.mcSeedEngine.Main;
import mccreeper8890.mcSeedEngine.io.Document;
import mccreeper8890.mcSeedEngine.io.DocumentException;
import mccreeper8890.mcSeedEngine.io.SystemReader;

public class Export {
	
	public static void call(SystemReader reader) throws IOException, DocumentException {
		System.out.println("What file?");
		String dir = reader.readLine();
		System.out.println("Pick one:");
		System.out.println("[1] Overwrite file");
		System.out.println("[2] Append to file");
		int mode = Integer.parseInt(reader.readLine());
		Document doc = new Document(dir, mode);
		for(int i = 0; i < Main.seeds.size(); i++) {
			int seed = Main.seeds.get(i);
			String description = Main.descriptions.get(seed);
			String line = Integer.toString(seed) + " " + description;
			doc.writeLine(line);
		}
	}

}
