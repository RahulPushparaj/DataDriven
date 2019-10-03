package Maven.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintOneRowAllTheValue 
{
	public static void main(String[] args) throws IOException  
	{
		File a = new File("D:\\PUSHPARAJ\\Maven\\Excel\\Book1.xlsx");
		FileInputStream b = new FileInputStream(a);
		Workbook w = new XSSFWorkbook(b);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) 
		{
			Cell c = r.getCell(i);
			System.out.println(c);
		}
	}
}
