package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.util.Asserts;
import org.checkerframework.checker.units.qual.A;
import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.bio.SocketConnector;
import org.mortbay.jetty.webapp.WebAppContext;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Start {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver =new ChromeDriver();
		driver.get("https://skryabin.com/market/quote.html");
		System.out.println("HIIII Gitttttttt how are yougi");
		System.out.println("From dekstop 2now");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		//Assert.assertTrue(driver.findElement(By.xpath("//label[@for=\"name\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//label[@for=\"name\"]")).isDisplayed());

		//Dimension d=new Dimension(50,50);
		//driver.manage().window().setSize(d);
		Thread.sleep(3000);
	//	driver.manage().window().fullscreen();
		//driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='well container-fluid form-container']/div//input[@id='attachment']")));
		driver.findElement(By.xpath("//a[@id='link']")).click();
		//Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		TakesScreenshot t=(TakesScreenshot) driver;
		File f1=t.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(f1,new File("C:\\Users\\swapn\\AppData\\Local\\Temp\\firstShot.png"));
		FileUtils.copyFile(f1, new File("target/f1.png"));
		System.out.println(f1.compareTo(new File("target/f2.png")));
		driver.navigate().back();
		Thread.sleep(3000);



		//Actions a=new Actions(driver);
		//a.sendKeys("crasher.apk");
		//a.keyDown(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();



		//Actions a=new Actions(getDriver());
		//a.sendKeys(Keys.valueOf("bl"));
      /*  Robot r=new Robot();
        r.keyPress(KeyEvent.VK_B);
        r.keyRelease(KeyEvent.VK_B);
        r.keyPress(KeyEvent.VK_L);
        r.keyRelease(KeyEvent.VK_L);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyPress();


		driver.close();


	/*

		Server server = new Server();
		SocketConnector connector = new SocketConnector();
		// Set some timeout options to make debugging easier.
		connector.setMaxIdleTime(1000 * 60 * 60);
		connector.setSoLingerTime(-1);
		connector.setPort(8080);
		server.setConnectors(new Connector[] { connector });

		WebAppContext bb = new WebAppContext();
		bb.setServer(server);
		bb.setContextPath("/");
		bb.setWar("src/main/webapp");

		
		// START JMX SERVER
		// MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
		// MBeanContainer mBeanContainer = new MBeanContainer(mBeanServer);
		// server.getContainer().addEventListener(mBeanContainer);
		// mBeanContainer.start();
		
		server.addHandler(bb);

		try {
			System.out.println(">>> STARTING EMBEDDED JETTY SERVER, PRESS ANY KEY TO STOP");
			server.start();
			while (System.in.available() == 0) {
				Thread.sleep(5000);
			}
			server.stop();
			server.join();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(100);
		}
	}

		 */
	}
}
