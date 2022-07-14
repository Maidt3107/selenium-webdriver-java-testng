package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02_By_Locator {
	// Bước 1: Mở Browser lên 
	// Bước 2: Nhập vào url
	// Bước 3: Click vào My Account để mở trang Login ra
	// Bước 4: Click Login 
	// Bước 5: Verify lỗi hiển thị 
	// Bước 6:Đóng browser
	
	  // khai báo 1 biến để đại diện cho thư viện Selenium WebDriver
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	@BeforeClass
	public void beforeClass() {
	// bước 1: Mở browser lên 
		System.setProperty("webdriver.gecko.driver", projectPath + "\\BrowserDriver\\\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		// bấm cho maximize browser lên 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@Test
	public void TC_01_() {
		// bước 2: nhập url vào 
		driver.get("http://live.techpanda.org/index.php/customer/account/login/");
		
		//bước 3: Click vào My Account để mở trang Login ra
		// HTML của element (Email Textbox)
//		<input type="email" autocapitalize="none"
//				autocorrect="off" spellcheck="false"
//				name="login[username]" value="" id="email"
//				class="input-text required-entry validate-email" title="Email Address">
		
		//HTML của element (Email Textbox)
		// input - thẻ của element này(tag name)
		// attribute name - type autocapitalize autocorrect spellcheck name value class title
		// attribute value - email none off..
		
		// Xpath Format
		//tagname[@attribute-name='attribute value']
		
		//input[@name='login[username]'] ->*
		//input[@id='email'] ->*
		//input[@title='Email Address'] ->*
		
		
		//CSS Format: tagname[attribute-name='attribute value']
		
		
		// tìm 1 element
		//ID
		driver.findElement(By.id("email"));
		
		// Class
		//1 - giá trị không có khoảng trắng ->lấy hết
		//2-> giá trị  có khoảng trắng -> không lấy hết
		driver.findElement(By.className("new-users"));
		
		// Name - Email Textbox
		driver.findElement(By.name("login[username]"));
		
		// Tagname - tìm xem có bao nhiêu element/page
		driver.findElement(By.tagName("a"));
		
		//LinkText (Link) - Text tuyệt đối 
		driver.findElement(By.linkText("SEARCH TERMS"));
		
		// Partial LinkText (Link) -Text tương đối/ tuyệt đối
		driver.findElement(By.partialLinkText("SEARCH TERMS"));
		driver.findElement(By.partialLinkText("CH TER"));
		driver.findElement(By.partialLinkText("SEARCH"));
		driver.findElement(By.partialLinkText("TERMS"));
		
		//CSS- cover được hết cả 6 loại trên 
		driver.findElement(By.cssSelector("input[name='login[username]']"));
		driver.findElement(By.cssSelector("input[id='email']"));
		driver.findElement(By.cssSelector("input[title='Email Address']"));
		
		
		//XPath
		driver.findElement(By.xpath("//input[@name='login[username]']"));
		driver.findElement(By.xpath("//input[@id='email']"));
		driver.findElement(By.xpath("//input[@title='Email Address']"));
		
		
		// tìm nhiều element
		// driver.findElements
	}

	@Test
	public void TC_02_() {
		
	}


	@AfterClass
	public void afterClass() {
		// Bước 6:Đóng browser
		driver.quit();

	}

	
}