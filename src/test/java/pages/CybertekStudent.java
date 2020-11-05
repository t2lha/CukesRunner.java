package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CybertekStudent extends CybertekLoginPage {

    public CybertekStudent () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement firstName;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement Lastname;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement email;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement passwordBtnInput;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement subjectBtnInput;

    @FindBy(xpath = "(//div[@class='form-group custom-mt-form-group'])[5]//select")
    public WebElement genderDropdown;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement birthDateBtnInput;
    //
    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement joiningDateBtnInput;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement confirmPasswordBtnInput;

    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement mobileNumberBtnInput;

    @FindBy(xpath = "(//input[@type='text'])[7]")
    public WebElement admissionNoBtnInput;

    @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement majorBtnInput;

    @FindBy(xpath = "(//input[@type='text'])[9]")
    public WebElement sectionBtnInput;

    @FindBy(xpath = "(//div[@class='form-group custom-mt-form-group']/select)[2]")
    public WebElement batchDropdown;

    @FindBy(xpath = "(//div[@class='form-group']/textarea)")
    public WebElement permanentAddressBtnInput;

    @FindBy(xpath = "(//input[@type='text'])[10]")
    public WebElement companyNameBtnInput;

    @FindBy(xpath = "(//input[@type='text'])[11]")
    public WebElement startDateBtnInput;

    @FindBy(xpath = "(//input[@type='text'])[12]")
    public WebElement streetBtnInput;

    @FindBy(xpath = "(//input[@type='text'])[13]")
    public WebElement stateBtnInput;

    @FindBy(xpath = "(//input[@type='text'])[14]")
    public WebElement titleBtnInput;

    @FindBy(xpath = "(//input[@type='text'])[15]")
    public WebElement cityBtnInput;

    @FindBy(xpath = "(//input[@type='number'])[2]")
    public WebElement zipBtnInput;

    @FindBy(xpath = "//button[@class='btn btn-primary mr-2']")
    public WebElement submitBtn;


    }

