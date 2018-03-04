package DDT;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Linkedin_login {
	
	@Test(dataProvider = "linkedin_login")
	
	public void login_to_linkedin(String username, String password) {
		
		System.setProperty("webdriver.gecko.driver", "/home/riya/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://in.linkedin.com/");
		driver.findElement(By.id("login-email")).sendKeys(username);
		driver.findElement(By.id("login-password")).sendKeys(password);
		driver.findElement(By.id("login-submit")).click();
		
		Assert.assertTrue(driver.getTitle().contains("Linkedin"), "user is not loggedin");
		
		System.out.println("user is logged in, verified");
		
	}

	/*@AfterMethod
	
	public void tearDown() {
		driver.quit();
     

     } */
     

	@DataProvider(name = "linkedin_login")
	
	public Object[][] passData(){
		int i;
		
		Read_Excel_For_linkedin refl = new Read_Excel_For_linkedin("//home//riya//eclipse-workspace//SeleniumCourse//TestData_Linkedin//test_sheet.xlsx");
		
		int row = refl.getRowCount(0);
		Object[][] array = new Object[row][2];
		for (i = 0; i<row; i++) {
			
			array[i][0] = refl.getData(0, i, 0);
			array[i][1] = refl.getData(0, i, 1);
			}
		
		return array;
	}
	
	
}
