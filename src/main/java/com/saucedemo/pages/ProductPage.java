package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage {
    private By productsHeader = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

    public boolean isProductHeaderDisplayed()
    {
        return find(productsHeader).isDisplayed();
    }
}
