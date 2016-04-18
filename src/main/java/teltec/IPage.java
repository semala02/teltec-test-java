package teltec;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IPage {
	protected static WebDriver driver;
	
	public IPage(){
		if (driver == null){
		 driver=new FirefoxDriver();
		}
	}

	
    public static void killDriver(){
    	if(driver != null){
    		driver.close();
    	}
    	
    }
 
}
