package com.adactinpages;
import java.util.List;
import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelConfirmPage extends BaseClass{
	public HotelConfirmPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="order_no")
	private List<WebElement> od;

	public List<WebElement> getOd() {
		return od;
	}
}
