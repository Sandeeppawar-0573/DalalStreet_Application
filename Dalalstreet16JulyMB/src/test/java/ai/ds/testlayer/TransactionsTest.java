package ai.ds.testlayer;

import org.testng.annotations.Test;

import ai.ds.testbase.TestBase;

public class TransactionsTest extends TestBase{
	
	@Test
	public void getTransactionsDetail() throws InterruptedException
	{
		dash.clickOnTransactionsLink();
		Thread.sleep(4000);
		System.out.println(tran.getData());
		tran.getAllData();
	}
}
