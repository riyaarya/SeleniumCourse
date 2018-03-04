package ConfigurationDEmo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import utility.ConfigReader;

@Test

public class TestSeleniumBlog {
	
	
	public void test_Config() throws Exception {
		
		/*File src = new File(".//Configuration//Config.property");
		
		FileInputStream fis = new FileInputStream(src);
	     Properties pro = new Properties();
	     pro.load(fis);
	     
	     String Geckopath = pro.getProperty("Geckodriver");*/
	    
		
		ConfigReader cr = new ConfigReader();
		 //System.out.println("hey i m geckodriver path:" +cr.getgeckopath());
		System.setProperty("webdriver.gecko.driver",cr.getgeckopath());
		WebDriver driver = new FirefoxDriver();
		
		
	}
	
	

}
