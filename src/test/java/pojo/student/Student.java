package pojo.student;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Student {
/*
 "firstName": "string",
         "gender": "string",
         "joinDate": "2020-11-05T02:52:27.585Z",
         "lastName": "string",
         "major": "string",
         "password": "string",
         "section": "string",
         "studentId": 0,
         "subject": "string"
          "admissionNo": "string",
  "batch": 0,
  "birthDate": "2020-11-05T02:52:27.585Z",
*/

    private String firstName;
    private String gender;
    private String joinDate;
    private String lastName;
    private String major;
    private String password;
    private String section;
    private String subject;
    private String admissionNo;
    private Integer batch;
    private String birthDate;

    Contact contact;
    Company company;

    private Integer studentId;


}
