package excelAllMethods;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.base.Throwables;

public class ReadWrite {

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
		//Iterate all rows in a sheet
		for(int i=1; i<=rc; i++)
		{
			String fname =ws.getRow(i).getCell(0).getStringCellValue();
			String mname  = ws.getRow(i).getCell(1).getStringCellValue();
			String lname = ws.getRow(i).getCell(2).getStringCellValue();

			int eid = (int) ws.getRow(i).getCell(3).getNumericCellValue();
			System.out.println(fname+"        "+mname+"       "+lname+"     "+eid);
			//write some text into status cell
		
			//ws.getRow(i).createCell(4).setCellValue("PASS");
			ws.getRow(i).createCell(4).setCellValue("faile");
		}
		//Closing file
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/Results.xlsx");
		//write into output file
		wb.write(fo);
		//close sheet
		fo.close();
		//close work book
		wb.close();



	}



}

