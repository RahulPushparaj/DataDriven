package Maven.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValueFromXL 
{
	public static void main(String[] args) throws IOException 
	{
		File loc = new File("D:\\PUSHPARAJ\\Maven\\Excel\\Book1.xlsx");
		FileInputStream l = new FileInputStream(loc);
		Workbook w= new XSSFWorkbook(l);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(5);
		System.out.println(c);
		
	}

}
