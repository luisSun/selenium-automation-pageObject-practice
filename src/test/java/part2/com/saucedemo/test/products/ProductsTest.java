package part2.com.saucedemo.test.products;

import com.saucedemo.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductIsDisplayed(){
        ProductPage productsPage = loginPage.loginIntoApp("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductHeaderDisplayed()," \n Product Header is not Displayed \n");

    }

}
