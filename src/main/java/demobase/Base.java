package demobase;

import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	 public static Properties login = new Properties();
	 public WebDriver driver;
	
	static Calendar cal = Calendar.getInstance();
    static java.util.Date dat =  cal.getTime();
    public static String timestamp=dat.toString().replace(":", " ");
    
    
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() throws IOException
	{
		FileReader file = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\Ihis\\src\\test\\resources\\config\\login.Properties");
		login.load(file);
		
		
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
		driver.get("http://106.51.48.104:9090/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


    @AfterMethod
    public void close() throws InterruptedException
   {
	
    	Thread.sleep(5000);
//    	driver.close();
//    	System.out.println("Launch Successfull");
   }

    
}


