package com.adactinpages;

import java.util.List;
import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBookingPage extends BaseClass {
	public HotelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private List<WebElement> fnm;
	@FindBy(id = "last_name")
	private List<WebElement> lst;
	@FindBy(id = "address")
	private List<WebElement> add;
	@FindBy(id = "cc_num")
	private List<WebElement> crdnum;
	@FindBy(id = "cc_type")
	private List<WebElement> crdtp;
	@FindBy(id = "cc_exp_month")
	private List<WebElement> expm;
	@FindBy(id = "cc_exp_year")
	private List<WebElement> expyr;
	@FindBy(id = "cc_cvv")
	private List<WebElement> cvv;
	@FindBy(id = "book_now")
	private List<WebElement> bknw;

	public List<WebElement> getFnm() {
		return fnm;
	}

	public List<WebElement> getLst() {
		return lst;
	}

	public List<WebElement> getAdd() {
		return add;
	}

	public List<WebElement> getCrdnum() {
		return crdnum;
	}

	public List<WebElement> getCrdtp() {
		return crdtp;
	}

	public List<WebElement> getExpm() {
		return expm;
	}

	public List<WebElement> getExpyr() {
		return expyr;
	}

	public List<WebElement> getCvv() {
		return cvv;
	}

	public List<WebElement> getBknw() {
		return bknw;
	}
}
