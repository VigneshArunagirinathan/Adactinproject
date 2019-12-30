package com.adactinpages;

import java.util.List;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSelectPage extends BaseClass {
	public HotelSelectPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private List<WebElement> radi;
	@FindBy(id = "continue")
	private List<WebElement> cnt;

	public List<WebElement> getCnt() {
		return cnt;
	}

	public List<WebElement> getRadi() {
		return radi;

	}
}
