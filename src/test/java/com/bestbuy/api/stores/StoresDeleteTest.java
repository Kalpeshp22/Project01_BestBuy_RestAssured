package com.bestbuy.api.stores;

import com.bestbuy.api.testbase.TestBaseStores;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoresDeleteTest extends TestBaseStores {

    @Test
    public void deleteStoreData() {


        Response response = given()
                .header("Content-Type", "application/json")
                .pathParams("id", "8931")
                .when()
                .delete("{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
