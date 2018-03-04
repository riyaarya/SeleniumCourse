package ConfigurationDEmo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ConfigReader;




public class Naukri_Signup {
	//S
	@Test(dataProvider = "Naukri_Signup")
	
	public void Signgup_to_naukri(String name, String email, String password,String number) 
	{
	
	ConfigReader cr = new ConfigReader();

		
		System.setProperty("webdriver.gecko.driver", cr.getgeckopath());
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(cr.geturl());
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div[2]/div/button/div/b")).click();
		driver.findElement(By.xpath("/html/body/div/form/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys(name);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("/html/body/main/div/div/form/div[3]/div[1]/div/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/div[4]/div[1]/div/input[2]")).sendKeys(number);
		
Select drp_country = new Select(driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input")));
drp_country.selectByValue("Delhi");
driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-uploader/div/div[1]/span[1]/input")).sendKeys("/home/riya/eclipse-workspace/SeleniumCourse/TestData/Facebook_sheet.xlsx1");
		
	}
	
	@DataProvider(name = "Naukri_Signup")
	
	public Object[][] passData() {
		int i;
	
		ConfigReader cr = new ConfigReader();
		String epath=cr.getsheet_credentials();
		
	
		Naukri_excel ne = new Naukri_excel(epath);
		int row = ne.getrowCount(0);
	    Object[][] arr = new Object[row][4];
		
		for(i=0; i<row;i++) {//isme ek hi row h to loop ki need h ni to wait
			
			arr[i][0] = ne.getData(0,i,0);
			arr[i][1] = ne.getData(0,i,1);
			arr[i][2] = ne.getData(0,i,2);
			arr[i][3] = ne.getData(0,i,3);
			System.out.println("hello");
			System.out.println(arr);
			
		}
	
		/*arr[0][0]="vale1";
		arr[0][1]="vale1";
		arr[0][2]="vale1";
		arr[0][3]="vale1";*/
		//return 
		return arr;
		
	}
	
	
}
	
//  this is noce 
// i like it

//erro sahi karo
