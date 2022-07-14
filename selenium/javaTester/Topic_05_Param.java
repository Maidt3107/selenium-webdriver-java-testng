package javaTester;

import org.testng.annotations.Test;

public class Topic_05_Param {
	// hàm không có tham số 
	public void clickToElement() {
		
	}
	//hàm này có 1 tham số
	// tham số này có kiểu dữ liệu là String
	public void clickToElement(String elemenetName) {
		
	}
	public void clickToElement(String elementName, String locatorName) {
		
	}
	@Test // test method / testcase / testscrip
	public void TC_01_Login() {
		clickToElement("Texbox ");
	}

}
