package excelAllMethods;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Formatcell {

	public static void main(String[] args)throws Throwable
	{
		FileInputStream fi = new FileInputStream("D:/Sampledata.xlsx");
		//get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb 
		XSSFSheet ws = wb.getSheet("Employee1");
		//count no of rows from emp sheet
		int rc = ws.getLastRowNum();
		System.out.println("no of rows are::"+rc);
		for (int  i=1; i<=rc; i++)
		{
		
		//	ws.getRow(i).createCell(4).setCellValue("PASS");
		//	ws.getRow(i).createCell(4).setCellValue("fail");
			ws.getRow(i).createCell(4).setCellValue("Blocked");
		XSSFCellStyle style  =wb.createCellStyle();
		XSSFFont font = wb.createFont();
		//font.setColor(IndexedColors.GREEN.getIndex());
		//font.setColor(IndexedColors.RED.getIndex());
		font.setColor(IndexedColors.GREY_25_PERCENT.getIndex());
		font.setBold(true);
		style.setFont(font);
		ws.getRow(i).getCell(4).setCellStyle(style);			
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/Output1.xlsx");
		wb.write(fo);
		wb.close();
		fo.close();
		
		

	}

}
