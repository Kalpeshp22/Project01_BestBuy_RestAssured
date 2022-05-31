package com.bestbuy.api.services;

import com.bestbuy.api.model.ServicePojo;
import com.bestbuy.api.testbase.TestBaseServices;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesPatchTest extends TestBaseServices {

    @Test
    public void updateNameInService() {
        ServicePojo servicePojo = new ServicePojo(); // create object of ServicePojo class

        servicePojo.setName("Computer Repair Services");

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 31)
                .body(servicePojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }


    }
