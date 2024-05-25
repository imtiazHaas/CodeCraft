package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_Elements {
	
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement userEmail;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement passWord;

	@FindBy(xpath="/html/body/div[2]/div/header/div/div[2]/div/button\n"
			+ "")
	public WebElement homePage;
	
}
