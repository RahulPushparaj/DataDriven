package Maven.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FindCellType
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:\\PUSHPARAJ123\\Maven\\Excel\\Book1.xlsx");
		FileInputStream i = new FileInputStream(f); 
		Workbook w = new XSSFWorkbook(i);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(4);
		System.out.println(c);
		int t = c.getCellType();
		System.out.println(t);
	}
}
