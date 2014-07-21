package test;

import static org.junit.Assert.*;
import main.Record;

import org.junit.Test;

public class RecordTest {

	@Test
	public void testSetGetId() {
		Record person = new Record();
		int id = 10;
		person.setId(10);
		assertEquals(id, person.getId());
	}
	@Test
	public void testSetGetName() {
		Record person = new Record();
		String name = "Jan";
		person.setName("Jan");;
		assertEquals(name, person.getName());
	}
	@Test
	public void testSetGetTelefonNumber() {
		Record person = new Record();
		int telefonNum = 123;
		person.setTelefonNumber(123);
		assertEquals(telefonNum, person.getTelefonNumber());
	}
}
