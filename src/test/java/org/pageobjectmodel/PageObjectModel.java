package org.pageobjectmodel;

import com.adactinpages.HotelBookingPage;
import com.adactinpages.HotelConfirmPage;
import com.adactinpages.HotelSearchPage;
import com.adactinpages.HotelSelectPage;
import com.adactinpages.LoginPage;

public class PageObjectModel {
	private LoginPage loginpage;
	private HotelSearchPage searchpage;
	private HotelSelectPage selectpage;
	private HotelBookingPage bookingpage;
	private HotelConfirmPage confirmpage;

	public HotelConfirmPage getConfirmpage() {
		return (confirmpage == null) ? confirmpage = new HotelConfirmPage() : confirmpage;
	}
	public HotelSelectPage getSelectpage() {
		return (selectpage == null) ? selectpage = new HotelSelectPage() : selectpage;
	}

	public LoginPage getLoginpage() {
		return (loginpage == null) ? loginpage = new LoginPage() : loginpage;
	}

	public HotelSearchPage getSearchpage() {
		return (searchpage == null) ? searchpage = new HotelSearchPage() : searchpage;
	}

	public HotelBookingPage getBookingpage() {
		return (bookingpage == null) ? bookingpage = new HotelBookingPage() : bookingpage;
	}

}
