package webdriver;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_07_Web_Element {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
    Actions action;

	@BeforeClass
	public void beforeClass() {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\BrowserDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void TC_01_Element() {
		// muốn thao tác được với elemet thì mình phải tìm elemet trước 
		// sau đó mới áp dụng hành vi vào cho element đó
		
		// 1 tìm element
		// 2 với laoij locator gì
		// 3 tương tác lên / kiểm tra nó
		
		// muốn thao tác trực tiếp lên element thì không cần khai báo biến 
		driver.findElement(By.id("send2")).click();
		
		// thao tác từ 2 lần trở lên thì cần khai báo biến tránh việc lặp lại 
		
		WebElement emailTexbox = driver.findElement(By.id("email"));
		emailTexbox.clear();
		emailTexbox.sendKeys("");
		emailTexbox.isDisplayed();
		
	}
	@Test
	public void TC_01_Element_Method() {
		WebElement element = driver.findElement(By.id(""));
		//xóa dữ liệu trong field cho phép nhập 
		// luôn luôn clear hết dữ liệu trước khi thao tác lên field đó
		// Texbox/ TexArea/ Editable Dropdown
		element.clear(); //************
		//nhập  dữ liệu trong field cho phép nhập 
		element.sendKeys("");//************
		element.sendKeys(Keys.ENTER);
		
		// element cha: findElement(By.className("footer"))
		// element tiếp theo của con: findElement(By.cssSelector("a[title='My Accont']"))
		driver.findElement(By.className("footer")).findElement(By.cssSelector("a[title='My Account']"));
		
		driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']"));
		
		
		// không khai báo biến = verify trưc tiếp 
		Assert.assertEquals(driver.findElement(By.id("search")).getAttribute("placeholder"), "Search entire store here...");
		// khai báo biến và dùng nhiều lần 
		String searchTextboxPlaceholderValue = driver.findElement(By.id("search")).getAttribute("placeholder");
		Assert.assertEquals(searchTextboxPlaceholderValue, "Search entire store here...");
		
		// GUI : Font Type/Font Size/ Color/ Pixel/...
		element.getCssValue("background-color");//************
		// rgb(51, 153, 204)
		element.getCssValue("font-size");
		//14px
		
		// GUI: Position/ Location/ Size of element
		element.getLocation();
		element.getRect();
		element.getSize();
		
		// Framework: Attach screenshot to Report HTML
		element.getScreenshotAs(OutputType.FILE);//************
		element = driver.findElement(By.xpath("//div[@id='advice-required-entry-email']"));
		element = driver.findElement(By.cssSelector("div[id='advice-required-entry-email']"));
		
		element = driver.findElement(By.cssSelector("#advice-required-entry-email"));
		 String emailTextboxTagname =  element.getTagName();
		 //  Output của elemet này sẽ là input của element khác 
		 
		 // truyền 1 biến vào trong chuỗi 
		 element = driver.findElement(By.xpath("//"   +  emailTextboxTagname +   "  div[@id='advice-validate_password']"));
		// chuỗi thứ 1 + biến + chuỗi thứ 2
		 
		 // lấy ra text của element hiện tại 
		 // text của những element con bên trong 
		 element.getText();//************
		 
		 // mong muốn 1 element hiển thị hoặc không hiển thị 
		 // Hiển thị : là người dùng nhìn thấy được/ có kích thước cụ thể( chiều rộng, chiều cao)
		 // áp dụng cho tất cả các loại element: textbox/ textatea / dropdown/ checkbox/ radio/ button...
		 element.isDisplayed();//************
		 
		 // mong muốn 1 element có thể thao tác được lên hoặc không 
		 // ngược lại với disable
		 // thao tác được : Enabled
		 // không thao tác được : Disable
		 // áp dụng cho tất cả các element: textbox/ textatea / dropdown/ checkbox/ radio/ button...
		 element.isEnabled();//************
		 
		 // mong muốn 1 element đã được chọn hay chưa
		 // áp dụng cho 1 vài loại element: checkbox/ radio button/ dropdown( Default)
		 element.isSelected();//************
		 
		 // click vào 1 element: 
		 // Button/ link/ checkbox/ Radio/ Image/ Icon
		 element.click();//************
		 
		 //giống hành vi Enter ở các form
		 // dùng cho tagname : form (element con bên trong) 
		 element.submit();
		 
		 // click lên Slider và giữ chuột 
		 // sau đó kéo Slider này 1 tọa độ bao nhiêu pixel
		 // kéo tới 1 element khác 
		 action.clickAndHold(element).moveToElement(element).perform();
		 
		 
	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}

}