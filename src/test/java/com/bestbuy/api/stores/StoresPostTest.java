package com.bestbuy.api.stores;

import com.bestbuy.api.model.StorePojo;
import com.bestbuy.api.testbase.TestBaseStores;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoresPostTest extends TestBaseStores {

    @Test
    public void createsANewStore(){

        StorePojo storePojo = new StorePojo();

        storePojo.setName("Hounslow");
        storePojo.setType("SuperStore");
        storePojo.setAddress(" 109 Bath Road ");
        storePojo.setAddress2("Hounslow");
        storePojo.setCity("London");
        storePojo.setState("London");
        storePojo.setZip("654321");
        storePojo.setLat(99.99999);
        storePojo.setLng(-66.66666);
        storePojo.setHours("Mon: 11-8; Tue: 10-6; Wed: 10-6; Thurs: 10-6; Fri: 10-6; Sat: 10-4; Sun: 10-2");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(storePojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPeek();
        System.out.println(response.statusCode());






    }

}
