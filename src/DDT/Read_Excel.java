package DDT;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {// this is class to read data in script???? yes
	
	XSSFWorkbook wb;// this is like declaration?? yes defining ha here XSSFWorkbook is internal poi library?
	// in java always say library to class so ye upar humne iska varibale decid ekiye na like deko ye //ha i got it
	
	XSSFSheet sheet1;// this is also definning??? yes declraing not defining 

	public Read_Excel(String excelpath) { //no constructor.. yes good..here we have passed path..no here we are declraing that 
		// it will recieve excel ka pathha whi mtlb h mra
		
		try { //this is we are handling exception ki agr path na mile to give eception?? yes yes
			
			File src = new File(excelpath);// this is java file object yes
			
			FileInputStream fis = new FileInputStream(src);//this is for input output?? yes creating stream with the giuve path
			
			wb = new XSSFWorkbook(fis);// this is object and passing fileinput stream here..yes 
			
			
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	}

	public String getData(int sheetNumber, int row, int column) {// getter method used here.. dont say getter methdo say a method
		// which will take out the information when sheet no and row and col is given
		sheet1 = wb.getSheetAt(sheetNumber);// here we are getting sheet number and storing in sheet1 variable?? sheet1 is object of the 
		// wb so we created another object with sheetnumber sheet1 ok
		String Data = sheet1.getRow(row).getCell(column).getStringCellValue();//here  we are getting sheet data yes 
		return Data; //why we have used return data ok lets put this A you will get when you see gmail class we dwill come 
		//here again by the flow ok..ok
	}
	
	public int getRowcount(int sheetIndex) {// this is again method to count row yes 
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();// once get row no it give the last row number of the sheet which has data ok
		row = row+1;//increase row when??? so lets ki sheet me 5 data hai to it will return lasst rown no is 4 because it starts from 0 na
		// to get the total no rows +1 na, means data is of 4 but will give us 5??are naui it starts from 0 na 0 1 2 3  4 kitna hua
		//5 so this funcyion is to get the total numer of rows ..ok
		
		return row;
		
	}
}
