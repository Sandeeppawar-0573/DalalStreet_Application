package ai.ds.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testbase.TestBase;

public class DashboardPage extends TestBase {
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}

	//--------- Obj repo --------------------
	private By txtbox_search = By.xpath("//input[@class='form-control']");
	private By option = By.xpath("(//div[@class='m-4 card'])[2]");
	private By link_transactions = By.xpath("//a[text()='Transactions']");

	//--------- Action methods ----------------
	public void enterCompanyName(String companyname)
	{
		driver.findElement(txtbox_search).sendKeys(companyname);
	}
	
	public void selectOption()
	{
		driver.findElement(option).click();
	}
	
	public void clickOnTransactionsLink()
	{
		driver.findElement(link_transactions).click();
	}
	
	
	
}
