/**
 * 
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Baraka
 * 
 */
public class ReaderRecord {

	private static int numReadEntities = 0;
	Scanner stream;

	public ReaderRecord() {
		try {
			stream = new Scanner(new File("src/files/data.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Cant find file in file system");
		}
	}

	public Record next() {
		Record person = null;
		setNumRed(getNumRed() + 1);
		int id = getNumRed();
		if (setRefNextRecord()) {
			person = new Record();
			person.setId(id);
			person.setName(stream.nextLine());
			person.setTelefonNumber(stream.nextLine());
		}
		return person;
	}

	private boolean setRefNextRecord() {		
		boolean isNext = false;
		String line;
		while(stream.hasNext() && !isNext){
			line = stream.nextLine();
			if(!line.isEmpty()){
				int regex = getNumRed();
				if (line.matches(Integer.toString(regex))){
					isNext = true;
				}
			}
		}
		
		return isNext;
	}

	public void closeStream() {
		stream.close();
	}

	public static int getNumRed() {
		return numReadEntities;
	}

	public static void setNumRed(int numRed) {
		ReaderRecord.numReadEntities = numRed;
	}

}
