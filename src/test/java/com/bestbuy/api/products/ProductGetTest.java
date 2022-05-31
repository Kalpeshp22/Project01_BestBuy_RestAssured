package com.bestbuy.api.products;

import com.bestbuy.api.testbase.TestBaseProducts;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductGetTest extends TestBaseProducts {

    @Test
    public void getAllProductInfo() {
        Response response = given().
                when().
                get();
        response.then().statusCode(200);
        response.prettyPeek();
    }

    @Test
    public void getSingleProductById() {
        Response response = given()
                .pathParams("id", 48530)
                .when().get("{id}");
        response.then().statusCode(200);
    }

}
