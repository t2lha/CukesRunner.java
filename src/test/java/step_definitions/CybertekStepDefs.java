package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CybertekLoginPage;
import pages.CybertekStudent;
import utilities.Config;
import utilities.Driver;
import utilities.Selenium_Utils;

public class CybertekStepDefs {

        CybertekLoginPage cybertekLoginPage = new CybertekLoginPage();
        CybertekStudent cybertekStudent = new CybertekStudent();
       // WebDriver driver = Driver.getDriver();

        @When("user is on the main page")
        public void user_is_on_the_main_page() {
                Driver.getDriver().get(Config.getProperty("url1"));
                Selenium_Utils.waitFor(4);
        }

        @Then("user clicks student")
        public void user_clicks_student() {

                cybertekLoginPage.studentstab.click();
                Selenium_Utils.waitFor(2);

        }

        @Then("user needs to click add students")
        public void user_needs_to_click_add_students() {
                cybertekLoginPage.addStudentTab.click();

        }

        @Then("user needs to fill the info")
        public void user_needs_to_fill_the_info() {

                cybertekStudent.FirstName.sendKeys("FirstName");
                cybertekStudent.Lastname.sendKeys("Hilfiger");
                cybertekStudent.email.sendKeys("tom.hilfiger@gmail.com");

        }

        @Then("click student again")
        public void click_student_again() {

        }

        @Then("click all students")
        public void click_all_students() {

        }

        @Then("enter the student id to check the data")
        public void enter_the_student_id_to_check_the_data() {

        }

    }

