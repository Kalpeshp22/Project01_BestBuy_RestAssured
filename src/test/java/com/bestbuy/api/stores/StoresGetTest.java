package com.bestbuy.api.stores;

import com.bestbuy.api.testbase.TestBaseStores;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class StoresGetTest extends TestBaseStores {

    @Test
    public void getAllStoresInfo(){
        Response response = given().
                when()
                .get();
        response.prettyPrint();
        response.then().statusCode(200);
        System.out.println(response.statusCode());
    }
     @Test
     public void getSingleStoresWithId(){
        Response response= given()
                .pathParams("id",4)
                        .when().get("{id}");
        response.prettyPrint();
        response.then().statusCode(200);
         System.out.println(response.statusCode());



     }
}
