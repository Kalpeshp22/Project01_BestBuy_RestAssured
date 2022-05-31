package com.bestbuy.api.services;

import com.bestbuy.api.model.ServicePojo;
import com.bestbuy.api.testbase.TestBaseServices;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesPostTest extends TestBaseServices {

    @Test
    public void CreateNewService(){

        ServicePojo servicePojo = new ServicePojo();
        // Create object of servicePojo class

        servicePojo.setName("Laptop Repair Services");

        Response response = given()
                .header("Content-TYpe", "application/json")
                .body(servicePojo)
                .post();
        response.then().statusCode(201);
        response.prettyPrint();
        System.out.println(response.statusCode());


    }



}
