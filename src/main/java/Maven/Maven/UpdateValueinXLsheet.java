package Maven.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateValueinXLsheet 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:\\PUSHPARAJ\\Maven\\Excel\\Book1.xlsx");
		FileInputStream i = new FileInputStream(f); 
		Workbook w = new XSSFWorkbook(i);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		System.out.println(c);
		c.setCellValue("gopi");
		
		Row r1 = s.createRow(0);
		Cell c1 = r1.createCell(0);
		System.out.println(c1);
		c1.setCellValue("Tool gate OMR");
	}

}
