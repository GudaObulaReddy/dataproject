package datacom.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readingDataFromExcel {
  
	public static void main(String[] args) throws IOException
	{      
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramakrishna\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	
		FileInputStream file=new FileInputStream("C:\\Users\\Ramakrishna\\Downloads\\HalfEbdyTestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		/*int colcount=sheet.getRow(0).getLastCellNum();
		for(int i=1;i<rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString();
				System.out.print("    "+value);
			}
			System.out.println();
		}*/
		
		
		
		for(int i=1;i<rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
			String firstname=currentrow.getCell(0).getStringCellValue();
			String lastname=currentrow.getCell(1).getStringCellValue();
			String email=currentrow.getCell(2).getStringCellValue();
			String passord=currentrow.getCell(3).getStringCellValue();
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(firstname);
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastname);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"PASSWORD\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"PASSWORD\"]")).sendKeys(passord);
		driver.findElement(By.xpath("//*[@id=\"ppaFormSbtBtn\"]")).click();
		}

	}

}
