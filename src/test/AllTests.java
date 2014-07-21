package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BoardConverterTest.class, ReaderRecordTest.class,
		RecordTest.class })
public class AllTests {
	public AllTests() {
		System.out.print("All test passed!!! - you are awesome");
	}
}
