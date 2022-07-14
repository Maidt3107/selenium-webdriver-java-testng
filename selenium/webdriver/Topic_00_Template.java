package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_00_Template {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String osName = System.getProperty("os.name");

	@BeforeClass
	public void beforeClass() {
		if (osName.contains("Mac")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "/BrowserDriver/geckodriver");

		} else {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\BrowserDriver\\geckodriver.exe");

		}

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void TC_01_() {
		driver.get("https://www.facebook.com/");
		// HTML Format
		/*
		 * <input class="text form-control" id="txtEmail" name="txtEmail"
		 * placeholder="Địa chỉ email" type="email" value="">
		 */

		// input[@class="text form-control"]
		// input[@id="txtEmail"] **
		// input[@name="txtEmail"] **
		// input[@placeholder="Địa chỉ email"]
		// input[@type="email"]
		// input[@value=""]

		// 1 - thẻ mở < hoặc <>
		// 2 - tên thẻ (tagname) input/html/head/ form/ label/ span/ p/ ...
		// 3 - thuộc tính( attribute): class / id/ name/ placeholder/type/value
		// 4 - giá trị thuộc tính ( attribute value) text form-control/ txtEmail/ ...
		// 5 - thẻ đóng > hoặc </>

		// Tagname - attibute name - attribute value ( tên thẻ)

		// XPath Format Basic
		// Absolute XPath :/ html/body/...
		// Relative XPath: // tagname[@sttribute-name='attribute-value']
		// Relative XPath: // tagname[@sttribute-name="attribute-value"]

		// CSS Format Basic
		// tagname[sttribute-name='attribute-value']
		// tagname[sttribute-name="attribute-value"]

	}

	@Test
	public void TC_02_() {

	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}

}