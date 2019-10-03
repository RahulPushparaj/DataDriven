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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	static WebDriver driver;
	public static void LaunchBrowser(String url) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\RAHUL\\Selenium\\Driverr\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	public static void closebrowser() {
		driver.quit();
	}
	public static void type(WebElement e,String s) {
		e.sendKeys(s);
	}
	public static void click(WebElement e) {
		e.click();
	}
	public static String getdata(int r,int c) throws IOException
	{
		File loc = new File("D:\\PUSHPARAJ\\Maven\\Excel\\Book1.xlsx");
		FileInputStream in = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(in);
		Sheet s = w.getSheet("Sheet1");
		Row row = s.getRow(r);
		Cell cell = row.getCell(c);
		int type = cell.getCellType();
		String value = null;
		if(type == 1)
		{
			value = cell.getStringCellValue();
		}
		else if(type == 0)
		{
			if(DateUtil.isCellDateFormatted(cell))
			{
				Date date = cell.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("mm/dd/yyyy");
				value = sim.format(date);
			}
			else 
			{
				double num = cell.getNumericCellValue();
				long l = (long)num;
				value = String.valueOf(l);
			}
		}
		return value;
	}
}
