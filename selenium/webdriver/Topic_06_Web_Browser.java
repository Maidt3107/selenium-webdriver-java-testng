package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_06_Web_Browser {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectPath + "\\BrowserDriver\\geckodriver.exe");
		driver = new FirefoxDriver();

	}

	@Test
	public void TC_01_Method() {
		// dùng để close browser/ tab
		// nếu như chỉ có 1 tab: close browser
		// nếu như nhiều hơn 1 tab: close tab đang active
		driver.close();

		// dùng để đóng browser luôn
		// không quan tâm có bao nhiêu tab
		driver.quit(); //*****//

		// mở 1 url ra
		driver.get("http://live.techpanda.org/index.php/customer/account/login/"); //*****//
		// *********  wait**********************
		// dùng để tìm nhiều element
		driver.findElement(By.xpath(""));//*****//
		
		// lấy ra url của page hiện tại
		driver.getCurrentUrl();
		
		// lấy ra source code (HTML/CSS/JS) của page hiện tại
		driver.getPageSource();
		
		// lấy ra Title của page hiện tại
		driver.getTitle();
		
		// *********  windows / tab**********************
		// dùng xử lí window / tab
		// lấy ra ID của window/ tab đang active
		driver.getWindowHandle();//*****

		// lấy ra ID của tất cả các window/ tab đang có
		driver.getWindowHandles();//*****
		// *********  Framework- cookie**********************
		// cookie: lưu lại phiên đăng nhập / session/ dữ liệu duyệt web/...
		 driver.manage().deleteAllCookies();
		// *********  Framework - log **********************
		 //driver.manage().logs().get(Log);
		 // chờ cho findElement/ findElements
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);//*****//
		// *********  Javascrip Excutor  **********************
		 // chờ cho 1 page load thành công
		 driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		 
		 // asynchronous scrip - bất đồng bộ 
		 // synchronous scrip - đồng bộ 
		 // chờ cho 1 đoạn code Javascrip được thực thi thành công 
		 driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);
		 // full hết toàn màn hình 
		 driver.manage().window().fullscreen();
		 
		 //mở rộng hết cửa sổ/
		 driver.manage().window().maximize();//*****//
		 
		 // thực tế không dùng : Test GUI/ Responsive(Font/ size/ color/ position/ location/..)
		 // set vị trí của browser so với độ phân giải màn hình (Resolution)
		 driver.manage().window().setPosition(new Point(0, 0));
		 driver.manage().window().getPosition();
		 
		 // mở browser với cái kích thước là bao nhiêu 
		 // test Responsive
		 driver.manage().window().setSize(new Dimension(1920,1880));
		 driver.manage().window().getSize();
		 
		 //tracking history tốt hơn 
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 driver.navigate().to("https://www.facebook.com/");
		// *********  Alert**********************
		 driver.switchTo().alert();  //*****
		// *********  Frame/ Iframe**********************
		 driver.switchTo().frame(0);  //*****
		// *********  Windows/ Tab**********************
		 driver.switchTo().window("");   //*****
		 
		 
	}

	@Test
	public void TC_02_() {

	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}

}