package mccreeper8890.mcSeedEngine.io;

import java.io.PrintStream;
import java.io.PrintWriter;

public class DocumentException extends Exception {
	
	private static final long serialVersionUID = 1L;

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.err.println("Document was not initialized in the mode called.");
	}

	@Override
	public void printStackTrace(PrintStream s) {
		// TODO Auto-generated method stub
		s.println("Document was not initialized in the mode called.");
	}

	@Override
	public void printStackTrace(PrintWriter s) {
		// TODO Auto-generated method stub
		s.println("Document was not initialized in the mode called.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DocumentException()";
	}
	
}
