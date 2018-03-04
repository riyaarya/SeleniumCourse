package ConfigurationDEmo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Naukri_excel {

	XSSFWorkbook wb;
	XSSFSheet sheet1;
	

	
	public Naukri_excel(String excelpath) {// yha parameter epath or excel hi?
		
		try {
			//thi ok
			
		File src = new File(excelpath);
		
		FileInputStream fis = new FileInputStream(src);
		
             wb = new XSSFWorkbook(fis);	
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public String getData(int sheetnumber,int row, int column) {
		
		sheet1 = wb.getSheetAt(sheetnumber);
		DataFormatter formatter = new DataFormatter();
		String Data = formatter.formatCellValue(sheet1.getRow(row).getCell(column));
		System.out.println(Data);
		return Data;
	}
		
		
		public int getrowCount(int sheetnumber) {
			
			int row = wb.getSheetAt(0).getLastRowNum();
		
			row = row+1;
			return row;
		}
	}
//
