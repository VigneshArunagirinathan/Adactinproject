package com.stepdefinition;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.helper.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.pageobjectmodel.PageObjectModel;

import io.cucumber.java.en.*;

public class AdactinStepDefinition extends BaseClass {

	PageObjectModel pp = new PageObjectModel();

	@Given("user is on Adactin page")
	public void user_is_on_Adactin_page() {

	}

	@When("user enters {string} and {string} and clicks the login button")
	public void user_enters_and_and_clicks_the_login_button(String username, String password) throws Throwable {
		WebElement x = pp.getLoginpage().getUser().get(0);
		write(x, username);
		WebElement y = pp.getLoginpage().getPass().get(0);
		write(y, password);
		Assert.assertEquals("verified", password, getAttr(y));
		WebElement z = pp.getLoginpage().getBtn().get(0);
		button(z);
	}

	@When("user enters {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enters(String location, String hotels, String roomtype, String roomnos, String datefrom, String dateto, String adults,
			String childs) {

		WebElement loc = pp.getSearchpage().getLoc().get(0);
		dropDown(loc, location);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement htl = pp.getSearchpage().getHotl().get(0);
		dropDown(htl, hotels);
		WebElement type = pp.getSearchpage().getRmt().get(0);
		dropDown(type, roomtype);
		WebElement num = pp.getSearchpage().getRno().get(0);
		dropDown(num, roomnos);
		WebElement adlt = pp.getSearchpage().getAdt().get(0);
		dropDown(adlt, adults);
		WebElement chld = pp.getSearchpage().getChld().get(0);
		dropDown(chld, childs);
		WebElement btn = pp.getSearchpage().getSmt().get(0);
		button(btn);
	}

	/**
	 * 
	 * @throws InterruptedException
	 */

	@When("select the hotel and click the continue button")
	public void select_the_hotel_and_click_the_continue_button() throws InterruptedException {
		WebElement g = pp.getSelectpage().getRadi().get(0);
		button(g);
		WebElement h = pp.getSelectpage().getCnt().get(0);
		button(h);
	}

	@When("user enter the {string},{string},{string},{string},{string},{string},{string},{string} click the book now button")
	public void user_enter_the_click_the_book_now_button(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) throws Throwable {
		WebElement l = pp.getBookingpage().getFnm().get(0);
		write(l, string);
		WebElement k = pp.getBookingpage().getLst().get(0);
		write(k, string2);
		WebElement j = pp.getBookingpage().getAdd().get(0);
		write(j, string3);
		WebElement h = pp.getBookingpage().getCrdnum().get(0);
		write(h, string4);
		WebElement g = pp.getBookingpage().getCrdtp().get(0);
		write(g, string5);
		WebElement f = pp.getBookingpage().getExpm().get(0);
		write(f, string6);
		WebElement d = pp.getBookingpage().getExpyr().get(0);
		write(d, string7);
		WebElement s = pp.getBookingpage().getCvv().get(0);
		write(s, string8);
		WebElement a = pp.getBookingpage().getBknw().get(0);
		button(a);
	}

	@Then("verify the url")
	public void verify_the_url() throws InterruptedException {

		Thread.sleep(10000);
		System.out.println(pp.getConfirmpage().getOd().get(0).getAttribute("value"));

	}

}