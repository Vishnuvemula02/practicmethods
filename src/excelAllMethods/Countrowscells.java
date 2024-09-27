package excelAllMethods;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Countrowscells {

	public static void main(String[] args) throws Throwable
	{
		//Read path of Excel File
		
		FileInputStream inputfile = new FileInputStream("D:/Sampledata.xlsx");
		//get workbook from file
		XSSFWorkbook wb = new XSSFWorkbook(inputfile);
		//get sheet from workbook
		XSSFSheet ws = 	wb.getSheet("Employee1");
		//count no of rows from Employee sheet
		int rc = ws.getLastRowNum();
		//get first row from Employee sheet
		XSSFRow row = ws.getRow(0);
		//count number cells in the Row 
		int cc = row.getLastCellNum();
		System.out.println("NO OF ROWS ARE::"+rc+"     "+"NO OF CELLS ARE::" +cc);
		//close the file
		inputfile.close();
		//close the work book
		wb.close();
	}			
		
	}