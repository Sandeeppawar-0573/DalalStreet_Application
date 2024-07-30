package ai.ds.testbase;

import java.time.Duration;




import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import ai.ds.pagelayer.DashboardPage;
import ai.ds.pagelayer.ExchangePage;
import ai.ds.pagelayer.LoginPage;
import ai.ds.pagelayer.TransactionsPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {

	public static WebDriver driver;
	public static Logger logger;
	public LoginPage login;
	public DashboardPage dash;
	public ExchangePage exchange;
	public TransactionsPage tran;
	
	@BeforeTest
	public void start()
	{
		logger = Logger.getLogger("DalaStreet Automation Framework");
		PropertyConfigurator.configure("Log4j.properties");
		
		logger.info("Framework execution started");
	}
	
	@AfterTest
	public void end()
	{
		logger.info("Framework execution completed");
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		String br = "CHROME";
		
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Provide valid browser");
		}
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger.info("Browser launched, maximized, provided waits");
		
		
		// ---------- Object Creation ---------- 
		login = new LoginPage();
		dash = new DashboardPage();
		exchange = new ExchangePage();
		tran = new TransactionsPage();
		logger.info("Object Creation");
		//---------- login Steps ---------------------
		login.enterEmailID("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickOnLoginButton();
		Thread.sleep(3000);
		logger.info("Login into application");
	}
	
	@AfterMethod
	public void tearDown()
	{
//		driver.quit();
	}
	
}
