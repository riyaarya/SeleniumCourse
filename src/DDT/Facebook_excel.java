package DDT;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Facebook_excel {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	
	public Facebook_excel(String excelpath) {
		
		try {
		
		File src = new File(excelpath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		
	}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
		}
	
	public String getData(int sheetnumber, int row, int column) {
		
		sheet1 = wb.getSheetAt(sheetnumber);// ye kyu likha yha
		
		
		
		String Data = sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return Data;
	}
	
	public int getrowCount(int sheetindex) {
		int row = wb.getSheetAt(sheetindex).getLastRowNum();
		row = row+1;
		
		return row;
		 
		
		
	}

}
