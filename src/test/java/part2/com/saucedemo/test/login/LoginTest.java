package part2.com.saucedemo.test.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginErrorMessage(){
        loginPage.setUserName("standard_user");
        loginPage.setPassword("senahincorreta");
        loginPage.clickLoginBtn();
        String actualMessage = loginPage.getErrorMessage();

        //Testa se Tiver True se actualMessage contem Epic sadface
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }

    @Test
    public void testLoginWithoutUserName() {
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginBtn();
        String actualMessage = loginPage.getErrorMessage();

        String expectedMessage = "Epic sadface: Username is required";

        Assert.assertEquals(actualMessage.trim(), expectedMessage,
                "Mensagem de erro incorreta...");
    }


    @Test
    public void testLoginWithoutPassword() {
        loginPage.setUserName("standard_user");
        loginPage.clickLoginBtn();
        String actualMessage = loginPage.getErrorMessage();

        String expectedMessage = "Epic sadface: Password is required";

        Assert.assertEquals(actualMessage.trim(), expectedMessage,
                "Mensagem de erro incorreta...");
    }

}
