package com.saucedemo.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.saucedemo.pages.BasePage;

public class LoginPage extends BasePage {

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    //Metodos

    public void setUserName(String userName) {
        set(usernameField, userName);
    }

    public void setPassword(String pass) {
        set(passwordField, pass);
    }

    //Metodo de transição
    public ProductPage clickLoginBtn() {
        click(loginButton);
        return new ProductPage();
    }

    //Metodo de conveniencia
    public ProductPage loginIntoApp(String username, String pass) {
        setUserName(username);
        setPassword(pass);
        return clickLoginBtn();
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }


}
