package PageObject.Railway;

import Constant.Constant;
import PageObject.Railway.GeneralPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class BookTicketPage extends GeneralPage {

    // Locators
    private final By frmBookTicketForm = By.xpath("//fieldset");

    // Elements
    public WebElement getFrmBookTicketForm()
    {
        return Constant.WEBDRIVER.findElement(frmBookTicketForm);
    }

    // Methods
    public boolean checkBookTicketForm()
    {
        return getFrmBookTicketForm().isDisplayed();
    }

    public boolean checkBookTicketPageTitle()
    {
        String title = "Book ticket";
        return this.getLabelPageTitle().getText().equals(title);
    }


}