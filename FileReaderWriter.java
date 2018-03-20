package com.practice.inputoutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriter {

	public void readFile(String path) throws IOException {
	
		FileReader reader = new FileReader(path);
		
		BufferedReader br = new BufferedReader(reader);
		
		
		try {
			
			String line;
				while ((line = br.readLine()) != null ) {
					System.out.println("Character retrieved " + line);
				}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			reader.close();
		}
		
	}

public static void main(String args[]) throws FileNotFoundException {
	FileReaderWriter frw = new FileReaderWriter();
	try {
		frw.readFile("/Users/ymano/Desktop/untitled folder/abc.txt");
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}