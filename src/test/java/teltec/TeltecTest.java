package teltec;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import teltec.IPage;
import teltec.StartPage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TeltecTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		   IPage.killDriver();
	}

	@Test
	public void test() {
		StartPage start = new StartPage();
	}

}
