package test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import main.BoardConverter;
import main.Record;

import org.junit.Test;

public class BoardConverterTest {

	@Test
	public void testConstructors() {
		BoardConverter bc = new BoardConverter();
		Map<String, String> exspectTab = new HashMap<>();
		Map<String, String> actualTab = bc.getTableBoard();
		exspectTab.put("a", "2");exspectTab.put("j", "5");exspectTab.put("t", "8");		
		exspectTab.put("b", "2");exspectTab.put("k", "5");exspectTab.put("u", "8");
		exspectTab.put("c", "2");exspectTab.put("l", "5");exspectTab.put("v", "8");
		exspectTab.put("d", "3");exspectTab.put("m", "6");exspectTab.put("w", "9");
		exspectTab.put("e", "3");exspectTab.put("n", "6");exspectTab.put("x", "9");
		exspectTab.put("f", "3");exspectTab.put("o", "6");exspectTab.put("y", "9");
		exspectTab.put("g", "4");exspectTab.put("p", "7");exspectTab.put("z", "9");
		exspectTab.put("h", "4");exspectTab.put("q", "7");
		exspectTab.put("i", "4");exspectTab.put("r", "7");
								 exspectTab.put("s", "7");
								 
		assertEquals(exspectTab, actualTab);			
		exspectTab.put("1", "9");
		assertNotEquals(exspectTab, actualTab);	

	}
	@Test
	public void testConvertRecord() {
		BoardConverter bc = new BoardConverter();
		
		Record person = new Record();
		person.setId(1);
		person.setName("Dawid");
		person.setTelefonNumber(789457321);

		Record actualPerson = bc.convert(person);
		Record expectedPerson = person;
		expectedPerson.setName("32943");
		assertEquals(expectedPerson.getId(), actualPerson.getId());
//		assertEquals(expectedPerson.getName() , actualPerson.getName());
//		assertEquals(expectedPerson.getTelefonNumber(), actualPerson.getTelefonNumber());
		
	}

}
