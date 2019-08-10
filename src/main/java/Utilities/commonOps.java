package Utilities;

import org.openqa.selenium.WebElement;

public class CommonOps extends Base{
	
	public void validateElementDisplayed(WebElement element) {
		element.isDisplayed();
	}

}
