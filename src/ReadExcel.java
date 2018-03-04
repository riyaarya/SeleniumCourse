import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//here at we are doing is we have given first path of excel

public class ReadExcel {
	
	public static void main(String args[]) throws IOException{
		int i;
		
		File src = new File("//home//riya//Downloads//test_wordpress.xlsx");// this is
		
		
		FileInputStream fis = new FileInputStream(src);//here for inout stream is created here like we have written 
		//ething in excel to that is input na tp isliy we have writte this na? input means we are opening for I/O both operation 
		//is ;ine ka kya mtlb hua agr ni likhe to kyu error aygi are basically weare cteatijg pip throughwhich data will flow either
		//will come or go, ok so means we have to create in read and write both sheete?yes 
		
        XSSFWorkbook wb = new XSSFWorkbook(fis);// this is what?for excel here this is we are connecting with this libarry whihc 
        // helps in reading or writimg csv excel files ok..input stream is also lib?
        // no dekho file is default come with java but humne POI download kiya ne for XSS functions ha to
        // to kya are its third party library you cansay POI but file stream is default functionality of java file class
        //ok
		
		XSSFSheet sheet1 = wb.getSheetAt(0);//here we are accesssing sheet??? yes 0means ye jo tbs hote hai na botton me ok.got
		
		/*String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();// here we are accessing row and cell..yes
		System.out.println("data from excel is :" +data0);
		

		String data1= sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("data from excel is :" +data1);*/
		
		int row_num = sheet1.getLastRowNum();
		
		for(i = 0; i<=row_num; i++){
			
			 String test = sheet1.getRow(i).getCell(0).getStringCellValue();
			 String test1 = sheet1.getRow(i).getCell(1).getStringCellValue();
			
			/*sheet1.getRow(0).createCell(2).setCellValue("Pass");
			sheet1.getRow(1).createCell(2).setCellValue("Fail");*/
			
			FileOutputStream fout = new FileOutputStream(src);
			wb.write(fout);
			wb.close();// closing here
			

			 
			 //System.out.println("showm me row count:" +test +test1);
			 
			 
			 
			 
			 
			
		}
		
		
		
		
		
		
	}
}
	//} 
