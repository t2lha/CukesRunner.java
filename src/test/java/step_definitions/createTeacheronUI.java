package step_definitions;

import cucumber.api.java.en.Then;
import pages.CybertekStudent;
import utilities.Selenium_Utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class createTeacheronUI {

    Map <String, String> data = new HashMap<String,String>();

    CybertekStudent student = new CybertekStudent();

    @Then("user enter create student fields")
    public void user_enter_create_student_fields(io.cucumber.datatable.DataTable dataTable) {

        Selenium_Utils.waitFor(2);

        data = dataTable.asMap(String.class,String.class);

        student.firstName.sendKeys(data.get("firstName"));
        student.Lastname.sendKeys(data.get("lastName"));
        student.email.sendKeys(data.get("email"));
        student.passwordBtnInput.sendKeys(data.get("password"));
        student.confirmPasswordBtnInput.sendKeys("confirmPass");
        student.subjectBtnInput.sendKeys(data.get("subject"));
        student.mobileNumberBtnInput.sendKeys(data.get("phoneNumber"));
        student.joiningDateBtnInput.sendKeys(data.get("joiningDate"));
        student.genderDropdown.sendKeys(data.get("gender"));

        student.mobileNumberBtnInput.clear();

        Selenium_Utils.waitFor(2);

        student.mobileNumberBtnInput.sendKeys(data.get("phoneNumber"));
        student.admissionNoBtnInput.sendKeys(data.get("admissionNo"));
        student.birthDateBtnInput.sendKeys(data.get("birthDate"));
        student.majorBtnInput.sendKeys(data.get("major"));
        student.batchDropdown.sendKeys(data.get("batch"));

        student.sectionBtnInput.clear();
        Selenium_Utils.waitFor(2);

        student.sectionBtnInput.sendKeys(data.get("section"));
        student.permanentAddressBtnInput.sendKeys(data.get("permanentAdd"));
        student.companyNameBtnInput.sendKeys(data.get("companyName"));
        student.titleBtnInput.sendKeys(data.get("title"));
        student.startDateBtnInput.sendKeys(data.get("startDate"));
        student.cityBtnInput.sendKeys(data.get("city"));
        student.streetBtnInput.sendKeys(data.get("street"));
        student.stateBtnInput.sendKeys(data.get("state"));
        student.zipBtnInput.sendKeys(data.get("zipcode"));

        student.submitBtn.click();
    }
}
