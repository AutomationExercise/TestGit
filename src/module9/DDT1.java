package module9;

import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.BeforeTest;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

public class DDT1 {
	
	public WebDriver driver;
	/*Workbook wb;
	Sheet sh;
	int rownum;
	int colnum;*/
			
	
	@Test
	public void openApp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		//driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
	driver.get("https://www.google.com/");
	}
	
	
	//@Test //(dataProvider = "TD")
	public void FillForm() throws Exception {
		
		Thread.sleep(2000);
		// Enter in FirstName field
		driver.findElement(By.id("ts_first_name")).clear();
		driver.findElement(By.id("ts_first_name")).sendKeys("Muhammad");
		
		Thread.sleep(2000);
		// Enter in LastName field
		driver.findElement(By.id("ts_last_name")).clear();
		driver.findElement(By.id("ts_last_name")).sendKeys("Lilla");
		
		Thread.sleep(2000);
		// Enter in Address field
		driver.findElement(By.id("ts_address")).clear();
		driver.findElement(By.id("ts_address")).sendKeys("VA");
			
	}
	
	/*@DataProvider(name = "TD")
	public Object[][] TestDataFeed() throws IOException, BiffException {
		
		// gives the location of the file
		FileInputStream fis = new FileInputStream("C:\\TestEclipse\\Edureka_15thDec\\src\\module9\\DataDriverTest.xlsx");
		
		wb = Workbook.getWorkbook(fis); // opens the workbook
		sh = wb.getSheet("DDT1"); // opens the sheet
		rownum = sh.getRows(); // look at the sheet for the row number
		colnum = sh.getColumns(); // look for the sheet for column number
		
			Object[][] FormData = new Object[rownum][colnum];
			
			for(int i=0; i<rownum; i++) {
				for(int j=0; j<colnum; j++) {
					// Fetch the FirstName value
					FormData[i][j] = sh.getCell(j, i).getContents();
					
					// Fetch the LastName value
					FormData[i][j] = sh.getCell(j, i).getContents();
					
					// Fetch the Address
					FormData[i][j] = sh.getCell(j, i).getContents();
				}
			}
		
			return FormData;*/
			
	/*//}
		
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}*/

}