package utilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.RequestBody;
import pojo.ResponseBody;

public class API_Utils {

    static ResponseBody responseBody = null;
    static Response response =null;

    //CRUD Operation. One  method for each operation.
    //One method should handle any APis are hitting.
    public static void hitGET(String resource) {
        String uri = Config.getProperty("baseURL") + resource;

        response = RestAssured.given().get(uri);
        // System.out.print(response.prettyPrint());
        // Assert.assertEquals("Get API hit failed", 200, response.statusCode());
        System.out.println("STATUS CODE: "+response.statusCode());
        try {
            responseBody = response.body().as( ResponseBody.class);
        } catch (Exception j) {

            j.printStackTrace();
            System.err.println("Response could not map properly with RestAssured Library");

        }



    }








    public static void hitPOST(String resource, RequestBody jsonBody) {
        String uri = Config.getProperty("baseURL") + resource;

        response = RestAssured.given().contentType(ContentType.JSON).body(jsonBody).when().post(uri);
        System.out.println(response.prettyPrint());
        System.out.println(response.statusCode());


        try {
            responseBody = response.as(ResponseBody.class);
        } catch (Exception j) {
            j.printStackTrace();
            System.err.println("Response could not map properly with RestAssured Library");
        }




    }
    public static void hitDELETE(String resource,Integer ID){
        String uri = Config.getProperty("baseURL") + resource+""+ID+"";


        response = RestAssured.delete(uri);


        if (response.getStatusCode()==200) System.out.println("The StatusCode is: " +response.getStatusCode()
                + "\nThe user with "+ ID +" ID number is successfully DELETED from API");
        else System.out.println("Either Resource: "  + resource + "\n OR  ID: " + ID + " is INVALID"  );

        System.out.println("STATUS CODE:" +response.statusCode());


        try {
            responseBody = response.as(ResponseBody.class);
        } catch (Exception j) {
            j.printStackTrace();
            System.err.println("Response could not map properly with RestAssured Library");
        }



    }
    public static void hitPUT(String resource, RequestBody body)  {
        String uri = Config.getProperty("baseURL")+resource;

        response = RestAssured.given().contentType(ContentType.JSON).body(body).when().put(uri);



        System.out.println(response.prettyPrint());
        //Assert.assertEquals("Get API hit failed", 200, response.statusCode());
        System.out.println("STATUS CODE: "+response.statusCode());

        try {
            responseBody = response.as( ResponseBody.class);
        } catch (Exception j) {
            j.printStackTrace();
            System.err.println("Response could not map properly with RestAssured Library");
        }

    }

    public static ResponseBody getResponseBody() {

        return responseBody;
    }

}
