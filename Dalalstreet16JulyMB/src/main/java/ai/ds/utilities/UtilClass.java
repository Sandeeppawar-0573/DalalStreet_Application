package ai.ds.utilities;

import java.io.File;
 
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testbase.TestBase;

public class UtilClass extends TestBase {
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void takeSS(String filename)
	{
		String path = "C:\\Users\\232338\\eclipse-workspace\\Dalalstreet16JulyMB\\screenshots\\";
		
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File sfile = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(path+filename+".png");
			FileHandler.copy(sfile, des);
		} 
		catch (IOException e) 
		{
			System.out.println("Provide correct path");
		}
	}

}
