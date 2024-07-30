package ai.ds.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testbase.TestBase;

public class ExchangePage extends TestBase {

	public ExchangePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------- Obj repo --------------------
	private By btn_buy1 = By.xpath("//a[contains(text(),'Buy')]");
	private By txtbox_quantity = By.xpath("//input[@name='input-Qunatity']");
	private By btn_buy2 = By.xpath("//button[contains(text(),'Buy')]");
	private By msg = By.xpath("//div[text()='Order Created successfully']");
	

	//--------- Action methods ----------------
	public void clickOnBuyButton1()
	{
		driver.findElement(btn_buy1).click();
	}
	
	public void enterQuantity(String count)
	{
		driver.findElement(txtbox_quantity).click();
		driver.findElement(txtbox_quantity).sendKeys(count);
	}
	
	public void clickOnBuyButton2()
	{
		driver.findElement(btn_buy2).click();
	}
	
	public String getStatus()
	{
		String msg1 = driver.findElement(msg).getText();
		return msg1;
	}
	
	public void clickOnIntraday()
	{
		driver.findElement(By.xpath("//label[text()='Intraday']")).click();
	}
}
