package com.baseclasses;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasses.BaseClass;

public class PojoClass extends BaseClass{

	public PojoClass() {
	PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	private WebElement txtUser;
	@FindBy(id="pass")
	private WebElement txtPass;
	@FindBy(name="login")
	private WebElement lgn;
	public WebElement getTxtUser() {
		return txtUser;
	}
	public void setTxtUser(WebElement txtUser) {
		this.txtUser = txtUser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public void setTxtPass(WebElement txtPass) {
		this.txtPass = txtPass;
	}
	public WebElement getLgn() {
		return lgn;
	}
	public void setLgn(WebElement lgn) {
		this.lgn = lgn;
	}
	
	

}
