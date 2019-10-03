package Maven.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintAllTheValue 
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("D:\\PUSHPARAJ\\Maven\\Excel\\Book1.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = xssfWorkbook.getSheet("sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++)
		{
			Row r = sheet.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++)
			{
				Cell c = r.getCell(j);
				System.out.println(c);
				
			}
		}			
	}
}
