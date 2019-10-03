package Maven.Maven;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IntegrateWithSeleniumXLread extends BaseClass
{
	public static void main(String[] args) throws IOException 
	{
		LaunchBrowser("https://www.facebook.com");
		WebElement e = driver.findElement(By.id("email"));
		type(e, getdata(0, 1));
		WebElement p = driver.findElement(By.id("pass"));
		type(p, getdata(0, 0));
	}
}
