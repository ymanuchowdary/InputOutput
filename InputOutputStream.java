package com.practice.inputoutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class InputOutputStream {
	
	public void writeFile() throws IOException	{
		File f = new File("/Users/ymano/Desktop/untitled folder/FileOutStream/test.rtf");
		
		OutputStream os = new FileOutputStream(f);
		
		String s = "Hello how are you";
		
		os.write(s.getBytes());
		
		os.close();
	}

	public static void main(String[] args) throws IOException {
		
		InputOutputStream ios = new InputOutputStream();
		
		ios.writeFile();
		
	}

}
