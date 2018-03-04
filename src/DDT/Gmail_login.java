package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Gmail_login 
{
	
	
	@Test(dataProvider = "wordpressdata")// this is script of gmaill...

	public void login_to_gmail(String username, String password) 
	{
		
	
		
		System.setProperty("webdriver.gecko.driver", "/home/riya/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "user is ot logged in");
		
		System.out.println("title verified, user is logged in");
		
		//System.out.println(driver.getTitle());
		
		driver.close();
	}

	
	
		@DataProvider(name = "wordpressdata")
		
		public Object[][] passdata() {
			int i;
			//here we have made the object of read_excel class and given path yes abhu dikha why it the use..yes
			Read_Excel re = new Read_Excel("//home//riya//eclipse-workspace//SeleniumCourse//TestData//Test_Sheet.xlsx");
			int row = re.getRowcount(0);// getting count of row yes the method we just discussed ..ok 
			//jb hmne phli script me alreay count kr lia still why we are doing again?? pehel function banaya usme kaha call kaha kiya batao
			// sirf function banaya na ha ok..
			
			Object[][] array  = new Object[row][2];// object creating of 2d array nahi array of object haaaaaa
			
			for(i= 0 ; i<row; i++) //used loop
			{
			
			/*array[0][0] = "admin";
			array[0][1] = "123456";
			array[1][0] = "pagal";
			array[1][1] = "pagal@nik";
			array[2][0] = "admin";
			array[2][1] = "demo123";
			*/
			
			array[i][0] = re.getData(0, i, 0);// har bar deta lene ke liye ye call kiya dekho get data and pass kiya har bar new row which is i
			// and dynamic and called on re which is object read_excel abhi claer ki iska kya use 
			//ha
			
			
			array[i][1] = re.getData(0, i, 1);
			
			
		}
			return array;

		}
}



