package Maven.Maven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create_Table 
{
	public static void main(String[] args) throws IOException 
	{	
		File f = new File("D:\\PUSHPARAJ123\\Maven\\Excel\\Book4.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("GGGG");
		CreationHelper ch = w.getCreationHelper();
		
		Row r1 = s.createRow((short) 0);
		r1.createCell(0).setCellValue(ch.createRichTextString("Rahul"));
		r1.createCell(1).setCellValue(ch.createRichTextString("Gopi"));
		r1.createCell(2).setCellValue(ch.createRichTextString("Tharik"));
		r1.createCell(3).setCellValue(ch.createRichTextString("Praveen"));
		r1.createCell(4).setCellValue(ch.createRichTextString("Push"));
		
		Row r2 = s.createRow((short) 1);
		r2.createCell(0).setCellValue(ch.createRichTextString("5000"));
		r2.createCell(1).setCellValue(ch.createRichTextString("2000"));
		r2.createCell(2).setCellValue(ch.createRichTextString("3000"));
		r2.createCell(3).setCellValue(ch.createRichTextString("4000"));
		r2.createCell(4).setCellValue(ch.createRichTextString("1000"));
		
		FileOutputStream out = new FileOutputStream(f);
		w.write(out);
		
	}
}














/*


Row r = s.createRow(0);
Cell c = r.createCell(0);
c.setCellValue("Rahul");
System.out.println(c);
Row r1 = s.createRow(0);
Cell c1 = r1.createCell(1);
c1.setCellValue("Gopi");
System.out.println(c1);
Row r2 = s.createRow(0);
Cell c2 = r2.createCell(2);
c2.setCellValue("Push");
System.out.println(c2);
FileOutputStream out = new FileOutputStream(f);
w.write(out);


*/