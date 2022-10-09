package com.udenycourse.steps.pages;

import java.util.List;
import java.util.NoSuchElementException;

public class AmrPage extends BasePage{
	
	private String agotado = "/html/body/aloha-app-root/aloha-detail/div/div[3]/div/div/aloha-infobox-container/aloha-infobox-sold-out/div";
						   //"/html/body/aloha-app-root/aloha-detail/div/div[3]/div/div/aloha-infobox-container/aloha-infobox-sold-out/div/h3";
	private String  label = "/html/body/aloha-app-root/aloha-detail/div/div[3]/div/div/aloha-infobox-container/aloha-infobox-sold-out/div\"";
	
	public AmrPage(){
		super(driver);
	}
	
	public void navigateLinksfromList(String url) {
		navigateTo(url);
	}
	public String getAgotado() {
		return textFromElement(label);
	}
	
	public boolean labelDisplayed() throws Exception {
		try{
			Thread.sleep(1000);
			return elementIsDisplayed(agotado);
		}catch(NoSuchElementException Error) {
			System.out.println("El elemento no fue encontrado");
			Error.printStackTrace();
		}
		return false;
	}
	
	public void closeChrome(){
		driver.close();
	}
}

