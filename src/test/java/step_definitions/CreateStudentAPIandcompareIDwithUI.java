package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.AllStudents;
import pojo.RequestBody;
import pojo.student.Address;
import pojo.student.Company;
import pojo.student.Contact;
import pojo.student.Student;

import java.util.HashMap;
import java.util.Map;

public class CreateStudentAPIandcompareIDwithUI {
            AllStudents allStudents = new AllStudents();
            Map<String,String> data = new HashMap<>();

            int studentIDFromAPi = 0;

    @Given("user hits and POST - Create a student on API {string}")
    public void user_hits_and_POST_Create_a_student_on_API(String string, io.cucumber.datatable.DataTable dataTable) {

        data=dataTable.asMap(String.class,String.class);
        RequestBody requestBody = new RequestBody();
        Student student = new Student();
        student.setFirstName(data.get("firstName"));
        student.setGender(data.get("gender"));
        student.setJoinDate(data.get("joinDate"));
        student.setLastName(data.get("lastName"));
        student.setMajor(data.get("major"));
        student.setPassword(data.get("password"));
        student.setSection(data.get("section"));
        student.setSubject(data.get("subject"));
        student.setAdmissionNo(data.get("admissionNo"));
        student.setBatch(Integer.parseInt(data.get("batch")));
        student.setBirthDate(data.get("birthDate"));


        Company company = new Company();
        company.setCompanyName(data.get("companyName"));
        company.setTitle(data.get("title"));
        company.setStartDate(data.get("startDate"));

        Address address = new Address();
        address.setCity(data.get("city"));
        address.setZipCode(Integer.parseInt(data.get("zipCode")));
        address.setState(data.get("state"));
        address.setStreet(data.get("street"));

        Contact contact = new Contact();
        contact.setPhone(data.get("phone"));
        contact.setEmailAddress(data.get("emailAddress"));
        contact.setPremanentAddress(data.get("premanentAddress"));

    }

    @When("user clicks to all students")
    public void user_clicks_to_all_students() {
        allStudents.allStudentsButton.click();

    }



    @When("user search the Student with {int}")
    public void user_search_the_Student_with(Integer int1) {
       allStudents.searchStudentById.click();
       allStudents.searchStudentById.sendKeys(String.valueOf(int1));
    }

    @When("user click on the student profile")
    public void user_click_on_the_student_profile() {


        allStudents.clickOnStudentProfile.click();
    }

    @When("user compare {string} with UI and API")
    public void user_compare_with_UI_and_API(String string) {


    }

}
