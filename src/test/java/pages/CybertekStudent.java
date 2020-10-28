package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CybertekStudent extends CybertekLoginPage {

    public CybertekStudent () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath ="(//input[@type='text'])[1]")
        public WebElement FirstName;

        @FindBy(xpath = "(//input[@type='text'])[5]" )
        public WebElement Lastname;

        @FindBy(xpath = "(//input[@type='text'])[2]")
        public WebElement email;

    }

