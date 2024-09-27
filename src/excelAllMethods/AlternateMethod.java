package excelAllMethods;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.base.Throwables;

public class AlternateMethod {

	public static void main(String[] args)throws Throwable 
	{
		//read path of excel file 
		FileInputStream fi = new FileInputStream("D:/Sampledata.xlsx");
		//get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb 
		XSSFSheet ws = wb.getSheet("Employee1");
		//count no of rows from emp sheet
		int rc = ws.getLastRowNum();
		System.out.println("no of rows are::"+rc);
		//print specific row from cell
		String fname =ws.getRow(1).getCell(0).getStringCellValue();
		String mname  = ws.getRow(1).getCell(1).getStringCellValue();
		String lname = ws.getRow(1).getCell(2).getStringCellValue();
	
		int eid = (int) ws.getRow(5).getCell(3).getNumericCellValue();
		System.out.println(fname+"        "+mname+"       "+lname+"     "+eid);
        fi.close();
        wb.close();
		
	}

}
