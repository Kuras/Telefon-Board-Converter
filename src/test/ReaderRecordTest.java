package test;

import static org.junit.Assert.*;
import main.ReaderRecord;
import main.Record;

import org.junit.Test;

public class ReaderRecordTest {

	@Test
	public void testReaderRecord() {
		ReaderRecord reader = new ReaderRecord();
		reader.closeStream();
	}
	@Test
	public void testNext() {
		ReaderRecord reader = new ReaderRecord();
		Record actual = reader.next();
		
		Record person = new Record();	
		person.setId(1);
		person.setName("Dawid Bielecki");
		person.setTelefonNumber(789457321);
		
		assertEquals(person.getId(), actual.getId());
		assertEquals(person.getName(), actual.getName());
		assertEquals(person.getTelefonNumber(), actual.getTelefonNumber());
		
		person.setId(2);
		person.setName("Sebania Baniosira");
		person.setTelefonNumber(231978456);
		actual = reader.next();
		
		assertEquals(person.getId(), actual.getId());
		assertEquals(person.getName(), actual.getName());
		assertEquals(person.getTelefonNumber(), actual.getTelefonNumber());
		
		person.setId(3);
		person.setName("Czeslaw Rak");
		person.setTelefonNumber(369589754);
		actual = reader.next();
		
		assertEquals(person.getId(), actual.getId());
		assertEquals(person.getName(), actual.getName());
		assertEquals(person.getTelefonNumber(), actual.getTelefonNumber());
		
		actual = reader.next();		
		assertNull(actual);

		reader.closeStream();
	}

}
