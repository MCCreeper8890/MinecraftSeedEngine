package mccreeper8890.mcSeedEngine.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Document {
	
	public static final int READ = 0;
	public static final int OVERWRITE = 1;
	public static final int APPEND = 2;
	
	private String dir;
	private int mode;
	
	private FileReader fr;
	private FileWriter fw;
	
	private BufferedReader reader;
	private BufferedWriter writer;
	
	private boolean readerInitialized;
	private boolean writerInitialized;
	
	public Document(String dir, int mode) {
		this.dir = dir;
		this.mode = mode;
		try {
			init();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void init() throws IOException {
		switch(mode) {
		case READ:
			fr = new FileReader(dir);
			reader = new BufferedReader(fr);
			readerInitialized = true;
			break;
		case OVERWRITE:
			fw = new FileWriter(dir);
			writer = new BufferedWriter(fw);
			writerInitialized = true;
			break;
		case APPEND:
			fr = new FileReader(dir);
			reader = new BufferedReader(fr);
			readerInitialized = true;
			ArrayList<String> fileContents = new ArrayList<String>();
			while (reader.ready()) {
				fileContents.add(reader.readLine());
			}
			fw = new FileWriter(dir);
			writer = new BufferedWriter(fw);
			writerInitialized = true;
			for (int i = 0; i < fileContents.size(); i++) {
				writer.write(fileContents.get(i) + "\n");
			}
			break;
		}
	}
	
	public String readLine() throws DocumentException, IOException {
		if (!readerInitialized) throw new DocumentException();
		return reader.readLine();
	}
	
	public void writeLine(String line) throws DocumentException, IOException {
		if (!writerInitialized) throw new DocumentException();
		writer.write(line + "\n");
	}

}
