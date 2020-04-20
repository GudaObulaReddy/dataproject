package datacom.data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First2 {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramakrishna\\Desktop\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.findElement(By.id("u_0_m")).sendKeys("obula");
	driver.findElement(By.id("u_0_m")).sendKeys("obula");
	driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("guda");
	driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("obul@gmail");
	driver.findElement(By.name("reg_passwd__")).sendKeys("54753384");
	driver.findElement(By.xpath("//input[@value='2']")).click();
	
	Select select=new Select(driver.findElement(By.id("day")));
	select.selectByVisibleText("5");
	Select select1=new Select(driver.findElement(By.id("month")));
	select1.selectByVisibleText("Apr");
	Select select2=new Select(driver.findElement(By.id("year")));
	select2.selectByVisibleText("1990");
	driver.findElement(By.className("_58mt")).click();
	driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
  Thread.sleep(5000);
	//driver.quit();

}}
