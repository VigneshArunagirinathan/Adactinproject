package com.adactinpages;

import java.util.List;
import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getUser() {
		return user;
	}

	public List<WebElement> getPass() {
		return pass;
	}

	public List<WebElement> getBtn() {
		return btn;
	}

	@FindBy(id = "username")
	private List<WebElement> user;
	@FindBy(id = "password")
	private List<WebElement> pass;
	@FindBy(id = "login")
	private List<WebElement> btn;

}
