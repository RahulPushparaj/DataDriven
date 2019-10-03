package Maven.Maven;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowManyCells_and_Rows 
{
	public static void main(String[] args) throws IOException 
	{
		File loc = new File("D:\\PUSHPARAJ\\Maven\\Excel\\Book1.xlsx");
		FileInputStream f = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		int i = s.getPhysicalNumberOfRows();
		System.out.println(i);
		Row r = s.getRow(0);
		
		int j = r.getPhysicalNumberOfCells();
		System.out.println(j);
		
	}

}
