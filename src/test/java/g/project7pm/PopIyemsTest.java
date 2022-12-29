package g.project7pm;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonmethods.ExtntRep;
import commonmethods.Scrnshot;
import commonmethods.TestBase;
import elERrpository.HomePage;
import elERrpository.Productdetailspage;
import exceldriven.Exceldata;

public class PopIyemsTest extends TestBase {
	static ExtntRep ext;
	@BeforeTest
	public static void steup() {
		 ext = new ExtntRep();
		ext.extentsetup();		
	}
	
	@AfterTest
	public void endtest() {
		
		ext.repgern();
	}
	
	@BeforeMethod
	public static void openbrowser() {
		TestBase tb = new TestBase();
		tb.launchbrowser("chrome");
		
		
	}
	@AfterMethod
	public static void closebrowser() {
		
		driver.close();
	}
	
	
	@Test
	public static void Tabletest() throws InterruptedException, IOException {
		Thread.sleep(10000);
		Scrnshot sc = new Scrnshot();
		HomePage hp = new HomePage(driver);
		Productdetailspage pro= new Productdetailspage(driver);
		hp.popitelms().click();
		Thread.sleep(5000);
		hp.tabletlink().click();
		String actualtablettext=pro.proddetails().getText();
		Exceldata excel = new Exceldata();
		String expectedtablettext=excel.readdata(1, 0);
		
		
		if(actualtablettext.contains(expectedtablettext)) {
			
			excel.writedata(1, 1, "valid data");
			ext.pass();
			
		}else {
			
			excel.writedata(1, 1, "invalid data");
			sc.sshot();
			ext.fail();
		}
		
		
		
	}
	@Test
	public static void laptoptest() throws InterruptedException, IOException {
		Thread.sleep(10000);
		Scrnshot sc = new Scrnshot();
		HomePage hp = new HomePage(driver);
		Productdetailspage pro= new Productdetailspage(driver);
		hp.popitelms().click();
		Thread.sleep(5000);

		hp.laptoplink().click();
		String actuallaptoptext=pro.proddetails().getText();
		Exceldata excel = new Exceldata();
		String expectedlaptoptext=excel.readdata(2, 0);
		
		
		if(actuallaptoptext.contains(expectedlaptoptext)) {
			
			excel.writedata(2, 1, "valid data");
			ext.pass();
			
		}else {
			
			excel.writedata(2, 1, "invalid data");
			sc.sshot();
			ext.fail();
		}
		
		
		
	}
	@Test
	public static void spktest() throws InterruptedException, IOException {
		Thread.sleep(10000);
		Scrnshot sc = new Scrnshot();
		HomePage hp = new HomePage(driver);
		Productdetailspage pro= new Productdetailspage(driver);
		hp.popitelms().click();
		Thread.sleep(5000);

		hp.spkrlink().click();
		String actualspktext=pro.proddetails().getText();
		Exceldata excel = new Exceldata();
		String expectedspktext=excel.readdata(3, 0);
		
		
		if(actualspktext.contains(expectedspktext)) {
			
			excel.writedata(3, 1, "valid data");
			ext.pass();
		}else {
			
			excel.writedata(3, 1, "invalid data");
			sc.sshot();
			ext.fail();
		}
		
		
		
	}
	
	

}
