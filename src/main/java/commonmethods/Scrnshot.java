package commonmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Scrnshot extends TestBase {
	
	
	public void sshot() throws IOException {
		
		File screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File("C:\\Users\\kiran\\eclipse-workspace\\project7pm\\resource\\scrnshot\\error1.png"));
	}
	

}
