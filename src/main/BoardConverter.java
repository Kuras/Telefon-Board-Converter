/**
 *  Class represent symbol's converter from board
 */
package main;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Baraka Created at 20.02.2014
 */
public class BoardConverter {
	/**
	 * TableBoard is a table of data to convert
	 */
	private HashMap<String, String> tableBoard;
	/**
	 * ReaderRecord is a stream to read record from structured file
	 */
	private ReaderRecord readerRecord;

	public BoardConverter() {
		tableBoard = new HashMap<>();
		tableBoard.put("a", "2");
		tableBoard.put("j", "5");
		tableBoard.put("t", "8");
		tableBoard.put("b", "2");
		tableBoard.put("k", "5");
		tableBoard.put("u", "8");
		tableBoard.put("c", "2");
		tableBoard.put("l", "5");
		tableBoard.put("v", "8");
		tableBoard.put("d", "3");
		tableBoard.put("m", "6");
		tableBoard.put("w", "9");
		tableBoard.put("e", "3");
		tableBoard.put("n", "6");
		tableBoard.put("x", "9");
		tableBoard.put("f", "3");
		tableBoard.put("o", "6");
		tableBoard.put("y", "9");
		tableBoard.put("g", "4");
		tableBoard.put("p", "7");
		tableBoard.put("z", "9");
		tableBoard.put("h", "4");
		tableBoard.put("q", "7");
		tableBoard.put("i", "4");
		tableBoard.put("r", "7");
		tableBoard.put("s", "7");
		readerRecord = new ReaderRecord();
	}

	/**
	 * Method returns Table of encoding char from board
	 * 
	 * @return Map of encoding letters
	 */
	public Map<String, String> getTableBoard() {
		return tableBoard;
	}

	public ReaderRecord getReaderRecord() {
		return readerRecord;
	}

	public Record convert(Record person) {		
		char[] nameSeq = person.getName().toLowerCase().toCharArray();
		String name = "";
		String key;
		for (char c : nameSeq) {		
			key = String.valueOf(c);
			if (tableBoard.containsKey(key)) {
				name += tableBoard.get(key);
			}
		}
		Record newPerson = new Record();
		newPerson.setId(person.getId());
		newPerson.setName(name);
		newPerson.setTelefonNumber(person.getTelefonNumber());
		return newPerson;
	}
	
	public void showConvertEntities(){
		Record person;
		while ((person = readerRecord.next()) != null) {
			System.out.println(convert(person));
		}
	}
}
