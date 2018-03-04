
	import org.junit.Test;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	//comment the above line and uncomment below line to use Chrome
	//import org.openqa.selenium.chrome.ChromeDriver;
	public class Ex {
		
		@Test
		


	    public void google() {
	    	
	    	System.setProperty("webdriver.gecko.driver","/home/riya/geckodriver");
			WebDriver driver = new FirefoxDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
	    	
	        driver.get("https://www.google.com");
	        driver.close();
	    }
	}

