package excelAllMethods;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadspaciferowcellData {

	public static void main(String[] args)throws Throwable
	{
		//cod is not working 
		//Read path of excel file in local	
		FileInputStream inputfile = new FileInputStream("D:/Sampledata.xlsx");
		//get work book from file
		XSSFWorkbook wb = new XSSFWorkbook(inputfile);
		//get sheet from wb
        XSSFSheet ws = wb.getSheetAt(0);
        //count no of rows
        int rc = ws.getLastRowNum();
        System.out.println("no of rows are ::" +rc);
        //get fifth row from sheet
        XSSFRow row = ws.getRow(4);
        XSSFCell c1 = row.getCell(0);
        XSSFCell c2 = row.getCell(1);
        XSSFCell c3 = row.getCell(2);
        XSSFCell c4 = row.getCell(3);
        //print each cell data        
		String fname = c1.getStringCellValue();
		String mname = c2.getStringCellValue();
		String lname = c3.getStringCellValue();
		String EMID =  c4.getStringCellValue();
		//Type casting
		int Status = (int)c4.getNumericCellValue();
		System.out.println(fname+ "    "+mname+"     "+lname+"      "+EMID+ "  "+Status);
		//close file
		inputfile.close();
		//close work book
		wb.close();
	}
}
