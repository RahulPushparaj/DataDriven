package Maven.Maven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateTheXLsheet 
{
	public static void main(String[] args) throws IOException 
	{	
		File f = new File("D:\\\\PUSHPARAJ\\\\Maven\\\\Excel\\\\Book3.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Greens");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("Toll Gate");
		FileOutputStream out = new FileOutputStream(f);
		w.write(out);
	}
}
