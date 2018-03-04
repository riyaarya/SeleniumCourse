package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook_login {
	
	@Test(dataProvider ="facebook_login" )
	
	public void login_facebook(String email, String password) {
		
		System.setProperty("webdriver.gecko.driver", "/home/riya/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
	}

	
	@DataProvider(name = "facebook_login")
	
	public Object[][] passData(){
		int i;
		Facebook_excel fe = new Facebook_excel("//home//riya//eclipse-workspace//SeleniumCourse//TestData//Facebook_sheet.xlsx");
		int row = fe.getrowCount(0);
		Object[][] arr = new Object[row][2];
		for(i = 0; i<row; i++) {
			arr[i][0] = fe.getData(0, i, 0);
			arr[i][1] = fe.getData(0,i,1);
		
		}
		return arr;
	}
	
}
