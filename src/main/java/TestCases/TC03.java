package TestCases;

import Common.Constant;
import PageObject.Railway.HomePage;
import PageObject.Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03 extends TestBase {
    @Test(description = "TC03 - User can not log into Railway with invalid password")
    public void TC03() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        System.out.println(" Navigate to QA Railway Website");
        homePage.open();

        System.out.println(" Click on 'Login' tab");
        homePage.gotoLoginPage();

        System.out.println(" Enter valid Email and invalid Password");
        System.out.println(" Click on 'Login' button");
        loginPage.login(Constant.USERNAME,Constant.INVALID_PASSWORD);

        String actualMsg = loginPage.getLoginErrorMsg();

        Assert.assertEquals(actualMsg,"There was a problem with your login and/or errors exist in your form.");
    }
}
