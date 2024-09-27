package excelAllMethods;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConvertINT_ROW_TO_STRING {

	public static void main(String[] args) throws Throwable {
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
		for(int i=1;i<=rc;i++)
		{
			if(wb.getSheet("Employee1").getRow(i).getCell(4).getCellType()==CellType.NUMERIC) 
			{
				int celldata = (int) wb.getSheet("Employee").getRow(i).getCell(3).getNumericCellValue();
				//converting integer type to string type
				String eid = String.valueOf(celldata);
				System.out.println(eid);
				ws.getRow(i).createCell(4).setCellValue("FAIL");

			}
			//Closing file
			fi.close();
			FileOutputStream fo = new FileOutputStream("D:/ResultA.xlsx");
			//write into output file
			wb.write(fo);
			fo.flush();
			//close sheet
			fo.close();
		}
			//close work book
			//wb.close();


			


	}

}
