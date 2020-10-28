package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CybertekLoginPage {

    public CybertekLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(linkText = "Students")
        public WebElement studentstab ;

        @FindBy(linkText = "Add Student")
        public WebElement addStudentTab;

        }





