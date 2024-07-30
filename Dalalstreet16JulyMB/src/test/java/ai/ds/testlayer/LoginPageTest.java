package ai.ds.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.ds.pagelayer.LoginPage;
import ai.ds.testbase.TestBase;

public class LoginPageTest extends TestBase {
	
	@Test
	public void verifyLoginTest() throws InterruptedException
	{
		String expected_op = "https://www.apps.dalalstreet.ai/";
		String actual_op = login.getActualUrl();
		System.out.println(actual_op);
		Assert.assertEquals(actual_op, expected_op);
	}
}
