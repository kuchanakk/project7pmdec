package elERrpository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Productdetailspage {
	
	
	WebDriver driver;
	
	public Productdetailspage(WebDriver driver) {
		this.driver=driver;
		
		
	}
	
	
	
	public WebElement proddetails() {
		
		return	driver.findElement(By.xpath("//*[@id=\"Description\"]/h1"));
			
			
		}
	

}
