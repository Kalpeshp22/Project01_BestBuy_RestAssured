package com.bestbuy.api.services;

import com.bestbuy.api.testbase.TestBaseServices;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesGetTest extends TestBaseServices {

    @Test
    public void getAllServicesInfo(){
        Response response = given()
                .when()
                .get(); // get list of all services
        response.then().statusCode(200); // to validate statusCode
        response.prettyPrint(); // print response into console
        System.out.println(response.statusCode());
    }
     @Test
     public void returnServiceBasedOnIds(){
      Response response = given()
              .pathParams("id","7")
              .when()
              .get("{id}"); // Get data of single service by his Id
      response.then().statusCode(200); // To validate statuscode
      response.prettyPrint();// to print response into console
      System.out.println(response.statusCode()); // to print status code in console


     }



}
