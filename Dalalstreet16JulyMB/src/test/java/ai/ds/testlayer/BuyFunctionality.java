package ai.ds.testlayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ai.ds.pagelayer.DashboardPage;
import ai.ds.pagelayer.ExchangePage;
import ai.ds.pagelayer.LoginPage;
import ai.ds.testbase.TestBase;

public class BuyFunctionality extends TestBase {
	
	
	@DataProvider(name = "companynames")
	public String[] testData()
	{
		String data[] =  {"WIPRO","AXIS","SBI","Tech Mahindra"};
		
		return data;
	}
	
	@Test(dataProvider="companynames")
	public void verifyBuyShareFunctionLongTerm(String company) throws InterruptedException
	{
		String expected_op = "Order Created successfully";
		dash.enterCompanyName(company);
		dash.selectOption();
		Thread.sleep(3000);
		exchange.clickOnBuyButton1();
		exchange.enterQuantity("2");
		exchange.clickOnBuyButton2();
		Thread.sleep(3000);
		String actual_op = exchange.getStatus();
		System.out.println(actual_op);
		Assert.assertEquals(actual_op, expected_op);
	}
	
//	@Test
//	public void verifyBuyShareFunctionIntraday() throws InterruptedException
//	{
//		String expected_op = "Order Created successfully";
//		dash.enterCompanyName("WIPRO");
//		dash.selectOption();
//		Thread.sleep(3000);
//		exchange.clickOnBuyButton1();
//		exchange.clickOnIntraday();
//		exchange.enterQuantity("2");
//		exchange.clickOnBuyButton2();
//		Thread.sleep(3000);
//		String actual_op = exchange.getStatus();
//		System.out.println(actual_op);
//		Assert.assertEquals(actual_op, expected_op);
//	}
	
	
	

}
