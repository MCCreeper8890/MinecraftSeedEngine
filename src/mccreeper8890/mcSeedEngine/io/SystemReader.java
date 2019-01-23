package mccreeper8890.mcSeedEngine.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemReader {
	
	private InputStreamReader isr;
	private BufferedReader reader;
	
	public SystemReader() {
		isr = new InputStreamReader(System.in);
		reader = new BufferedReader(isr);
	}
	
	public String readLine() throws IOException {
		return reader.readLine();
	}

}
