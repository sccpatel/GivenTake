package givenAutomation.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jenkinHello {
	@Test
	public static void launck() throws InterruptedException, IOException {

		System.out.println("Hello Mr. Virendra");

//		FileInputStream file=		   new FileInputStream("");
//		Properties properti=	     new Properties();
//		properti.load(file);
//		properti.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"))
		.sendKeys("patelvirendra08@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']"))
		.sendKeys("8542");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

}
