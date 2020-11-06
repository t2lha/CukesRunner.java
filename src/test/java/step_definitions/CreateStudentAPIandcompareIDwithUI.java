package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.junit.Test;
import pages.AllStudents;
import pojo.RequestBody;
import pojo.student.Address;
import pojo.student.Company;
import pojo.student.Contact;
import pojo.student.Student;
import utilities.API_Utils;

import java.util.HashMap;
import java.util.Map;

public class CreateStudentAPIandcompareIDwithUI {
            AllStudents allStudents = new AllStudents();
            Map<String,String> data = new HashMap<>();

          static   Integer studentIDFromAPi = 0;

    @Given("user hits and POST - Create a student on API {string}")
    public void user_hits_and_POST_Create_a_student_on_API(String resource, DataTable dataTable) {

        data=dataTable.asMap(String.class,String.class);
        RequestBody requestBody = new RequestBody();
        requestBody.setFirstName(data.get("firstName"));
        requestBody.setGender(data.get("gender"));
        requestBody.setJoinDate(data.get("joinDate"));
        requestBody.setLastName(data.get("lastName"));
        requestBody.setMajor(data.get("major"));
        requestBody.setPassword(data.get("password"));
        requestBody.setSection(data.get("section"));
        requestBody.setSubject(data.get("subject"));
        requestBody.setAdmissionNo(data.get("admissionNo"));
        requestBody.setBatch(Integer.parseInt(data.get("batch")));
        requestBody.setBirthDate(data.get("birthDate"));


        Company company = new Company();
        company.setCompanyName(data.get("companyName"));
        company.setTitle(data.get("title"));
        company.setStartDate(data.get("startDate"));


        Address address = new Address();
        address.setCity(data.get("city"));
        address.setZipCode(Integer.parseInt(data.get("zipCode")));
        address.setState(data.get("state"));
        address.setStreet(data.get("street"));

            company.setAddress(address);

            requestBody.setCompany(company);

        Contact contact = new Contact();
        contact.setPhone(data.get("phone"));
        contact.setEmailAddress(data.get("emailAddress"));
        contact.setPremanentAddress(data.get("premanentAddress"));

        requestBody.setContact(contact);

        API_Utils.hitPOST(resource,requestBody);


    }

    @When("user clicks to all students")
    public void user_clicks_to_all_students() {
        allStudents.allStudentsButton.click();

    }



    @When("user search the Student with {int}")
    public void user_search_the_Student_with(Integer studentIDFromAPi) {
       allStudents.searchStudentById.click();
        studentIDFromAPi= API_Utils.getResponseBody().getStudentId();
         this.studentIDFromAPi=studentIDFromAPi;


       allStudents.searchStudentById.sendKeys(String.valueOf(studentIDFromAPi));
       allStudents.searchButton.click();
    }

    @When("user click on the student profile")
    public void user_click_on_the_student_profile() {
        allStudents.clickOnStudentProfile.click();
    }

    @When("user compare {int} with UI and API")
    public void user_compare_with_UI_and_API(Integer idFromUI) {


        idFromUI= Integer.parseInt(allStudents.get_student_id.getText());
        System.out.println("St ID from API: "+studentIDFromAPi );
        System.out.println("ID from UI "+idFromUI);
        Assert.assertEquals(idFromUI,studentIDFromAPi);

    }


    @Test

    public void getMessi (){

        API_Utils.hitGET("student/all");
        int count=0;

        for (int i = 0; i <API_Utils.getResponseBody().getStudents().size() ; i++) {
            if (API_Utils.getResponseBody().getStudents().get(i).getFirstName().equals("Lionel")) {
                System.out.println(API_Utils.getResponseBody().getStudents().get(i).getFirstName());
                count++;

            }
        }
        System.out.println(count);


    }
}

