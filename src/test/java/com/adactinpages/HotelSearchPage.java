package com.adactinpages;

import java.util.List;
import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearchPage extends BaseClass {
	public HotelSearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private List<WebElement> loc;
	@FindBy(xpath = "//select[@name='hotels']")
	private List<WebElement> hotl;
	@FindBy(id = "room_type")
	private List<WebElement> rmt;
	@FindBy(id = "room_nos")
	private List<WebElement> rno;
	@FindBy(id = "datepick_in")
	private List<WebElement> dt;
	@FindBy(id = "datepick_out")
	private List<WebElement> dto;
	@FindBy(id = "adult_room")
	private List<WebElement> adt;
	@FindBy(id = "child_room")
	private List<WebElement> chld;
	@FindBy(id = "Submit")
	private List<WebElement> smt;
	@FindBy(id = "Reset")
	private List<WebElement> rst;

	public List<WebElement> getLoc() {
		return loc;
	}

	public List<WebElement> getHotl() {
		return hotl;
	}

	public List<WebElement> getRmt() {
		return rmt;
	}

	public List<WebElement> getRno() {
		return rno;
	}

	public List<WebElement> getDt() {
		return dt;
	}

	public List<WebElement> getDto() {
		return dto;
	}

	public List<WebElement> getAdt() {
		return adt;
	}

	public List<WebElement> getChld() {
		return chld;
	}

	public List<WebElement> getSmt() {
		return smt;
	}

	public List<WebElement> getRst() {
		return rst;
	}

}
