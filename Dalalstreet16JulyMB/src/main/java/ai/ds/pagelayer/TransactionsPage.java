package ai.ds.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testbase.TestBase;

public class TransactionsPage extends TestBase {

	public TransactionsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	private By data12 = By.xpath("//table/tbody/tr[1]/td[2]");
	
	
	public String getData()
	{
		String data0 = driver.findElement(data12).getText();
		return data0;
	}
	
	public void getAllData()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=9;j++)
			{
				String data0 = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data0+"  ");
			}
			System.out.println();
		}
	}
	
}
