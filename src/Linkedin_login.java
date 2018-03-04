import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Linkedin_login {
	
	
	public static void main(String[] args) throws IOException {
		
		int i;
		
	System.setProperty("webdriver.gecko.driver","//home//riya//geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://in.linkedin.com/");
		
		File src = new File("//home//riya//Downloads//Linkedin_test.xlsx");
		
		
		FileInputStream fis = new FileInputStream(src);
		
        XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.id("login-email")).sendKeys(data0);		

		System.out.println("data from excel is :" +data0);
		
		String data1= sheet1.getRow(1).getCell(1).getStringCellValue();

		driver.findElement(By.id("login-password")).sendKeys(data1);
		

		System.out.println("data from excel is :" +data1);
		driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
		
		driver.close();
		
		/*int row_num = sheet1.getLastRowNum();
		
		for(i = 0; i<=row_num; i++){
			
			 String test = sheet1.getRow(i).getCell(0).getStringCellValue();
			 String test1 = sheet1.getRow(i).getCell(1).getStringCellValue();*/
		
		
     

			 
			 
			 
			
		}
		
	}

