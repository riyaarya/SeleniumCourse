package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Twitter_login {
	
	@Test(dataProvider = "Twitter_login")
	
	public void login_twitter(String username, String password) {
		
		System.setProperty("webdriver.gecko.driver","/home/riya/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://twitter.com/");
		driver.findElement(By.xpath("//*[@id=\"doc\"]/div/div[1]/div[1]/div[1]/form/div[1]/input")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"doc\"]/div/div[1]/div[1]/div[1]/form/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"doc\"]/div/div[1]/div[1]/div[1]/form/input[1]")).click();
		
		Assert.assertTrue(driver.getTitle().contains("twitter"),"user is not logged in");
		System.out.println("verified, user is logged in");
		
	}
	
	
	@DataProvider(name = "Twitter_login")
	
	public Object[][] passData(){
		int i;
		
		Twitter_Excel te = new Twitter_Excel("//home//riya//eclipse-workspace//SeleniumCourse//TestData//Twitter_credentials.xlsx");
		int row = te.getrowCount(0);
		Object[][] arr = new Object[row][2];
		
		for (i=0; i<row; i++) {
			
			arr[i][0] = te.getData(0,i,0);
			arr[i][1] = te.getData(0, i, 1);
		}
		
		return arr;
	}
		
	

}
