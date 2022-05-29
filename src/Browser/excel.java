package Browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class excel {
	public static void main(String[] args) throws IOException {
		
		// to get the variable let the java know about it
		File  src = new File("C:\\Users\\HP\\Downloads\\ITSecurity.xlsx");
		
		//to load the file
		FileInputStream	 fis = new FileInputStream(src);
		
		//to load the workbook or excel file
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
	//	to get the sheet from the workbook
		XSSFSheet sh = wb.getSheetAt(0);
	
	String value = sh.getRow(3).getCell(2).getStringCellValue();
	System.out.println(value);
	// if we get to get numeric value 
	// celltype = sh.getRow(row).getCell(column).getCelltype();
	int lastRow = sh.getLastRowNum();
	
	System.out.println("Totle rows - "+lastRow);
	
	Row row = sh.getRow(0);
	
	short cellzs = row.getLastCellNum();
	
	System.out.println("totle cell inside the row ="+cellzs);

	Cell cell = (Cell) row.getCell(0);
	
	String type = ((org.apache.poi.ss.usermodel.Cell) cell).getCellType().toString();
	
	System.out.println(type);
	
	String data = ((org.apache.poi.ss.usermodel.Cell) cell).getStringCellValue();
	
	System.out.println(data);

	
	}

}
