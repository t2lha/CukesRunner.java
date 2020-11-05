
Feature: User should be able to update a student on API and validate with UI-DB

  @updateStudentValidateE2E  @Regression
  Scenario: User should be able to update a student on API and validate with UI-DB

    Given user hits and POST - Create a student on API "/student/create"
      | firstName        | Lionel                 |
      | lastName         | MESSI                  |
      | emailAddress     | lionel.messi@gmail.com |
      | joinDate         | 01/01/2011             |
      | password         | asd1234                 |
      | subject          | Math                   |
      | phone            | 3124756521             |
      | gender           | Male                   |
      | admissionNo      | 13                     |
      | birthDate        | 01/01/1998             |
      | major            | Math                   |
      | batch            | 10                     |
      | section          | BTT                    |
      | premanentAddress | 920 W Dearborn St.     |
      | companyName      | Barcelona              |
      | title            | Goat                   |
      | startDate        | 01/02/2019             |
      | city             | Barcelona              |
      | street           | 13 Addison             |
      | zipCode          | 60040                  |
      | state            | IL                     |

    When user is on the main page
    And user clicks student
    And user clicks to all students
    And user search the Student with 2334
    And user click on the student profile
    When user compare "ID" with UI and API
