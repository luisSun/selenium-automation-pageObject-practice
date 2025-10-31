package part2.com.saucedemo.base;

import com.saucedemo.pages.BasePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    //Declaracao de Variaveis
    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    private String baseUrl = "https://www.saucedemo.com/";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        basePage = new BasePage();
        basePage.setDriver(driver);

        loginPage = new LoginPage();
    }


    @BeforeMethod
    public void setUpMethod() {
        driver.get(baseUrl);
    }

    //Apos cada execucao
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

