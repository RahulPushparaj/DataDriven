package Maven.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Convert_DataorNumber_ToString 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:\\PUSHPARAJ\\Maven\\Excel\\Book1.xlsx");
		FileInputStream i = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(i);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(4);
		System.out.println(c);
		int t = c.getCellType();
	    if(t==1)
	    {
	    	String ss = c.getStringCellValue();
	    	System.out.println(ss);
	    }
	    else if (t==0) 
	    {
	    	if (DateUtil.isCellDateFormatted(c)) 
	    	{
	    		Date date = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("mm/dd/yyyy");
				String format = sim.format(date);
				System.out.println(format);
			}
	    	else 
	    	{
	    		double num = c.getNumericCellValue();
	    		long l = (long)num;
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
			}
		}
	}
}
