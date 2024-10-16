package Tests;

import Base.BaseTest;
import Pages.HomepagePage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
    }

   /* @Test
  /*  public void userCanLogin() throws InterruptedException {
        String username = "Valentina96";
        scrollToElement(HomepagePage.bookStoreApp);
        homePagePage.clickOnBookStoreApp();
        scrollToElement(sideBarPage.button.getLast());
        sideBarPage.clickOnButton("Login");
        logInPage.inputUsername(username);
        logInPage.inputPassword("Smoki1996!");
        scrollToElement(logInPage.logInButton);
        logInPage.clickOnLoginButton();
       // Thread.sleep(5000);
      wait.until(ExpectedConditions.visibilityOf(profilePage.userNameValue));
       Assert.assertTrue(profilePage.userNameValue.isDisplayed());
        Assert.assertEquals(profilePage.userNameValue.getText(), username);
*/
    }


