package teltec;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TeltecTestChrome {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		   IPageChrome.killDriver();
	}

	@Test
	public void test() {
		   StartPage2 start = new StartPage2();
	}

}
