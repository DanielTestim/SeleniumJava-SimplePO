package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utilities.base;

public class wikipediaMainPage extends base {
	
	public WebDriver driver;
	
	//Class Constructor
	public wikipediaMainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//WebElements Locating
	
	@FindBy(how = How.ID, using = "searchInput")
	public WebElement searchBox;
	
	@FindBy(how = How.ID, using = "searchLanguage")
	public WebElement searchLanguage;
	
	@FindBy(how = How.CSS, using = "button[type='submit']")
	public WebElement searchButton;
	
}