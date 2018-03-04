package DDT;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_For_linkedin {
	
	XSSFWorkbook wb;
	
	XSSFSheet sheet1;
	
	

	public Read_Excel_For_linkedin(String excelpath) {
		
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
		
		sheet1 = wb.getSheetAt(sheetnumber);
		String Data = sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return Data;
	}

	
	public int getRowCount(int sheetIndex) {
		
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row+1;
		
		return row;
		
		
	}
}
