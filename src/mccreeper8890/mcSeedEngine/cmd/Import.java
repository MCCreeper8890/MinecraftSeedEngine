package mccreeper8890.mcSeedEngine.cmd;

import java.io.IOException;

import mccreeper8890.mcSeedEngine.Main;
import mccreeper8890.mcSeedEngine.io.Document;
import mccreeper8890.mcSeedEngine.io.DocumentException;
import mccreeper8890.mcSeedEngine.io.SystemReader;

public class Import {
	
	public static void call(SystemReader reader) throws IOException, DocumentException {
		System.out.println("Which file?");
		String fileDir = reader.readLine();
		Document file = new Document(fileDir, Document.READ);
		String fileInput;
		while((fileInput = file.readLine()) != null) {
			String seedPre = fileInput.split(" ")[0];
			String description = fileInput.substring(seedPre.length() + 1);
			int seed = Integer.parseInt(seedPre);
			Main.seeds.add(seed);
			Main.descriptions.put(seed, description);
		}
	}

}
