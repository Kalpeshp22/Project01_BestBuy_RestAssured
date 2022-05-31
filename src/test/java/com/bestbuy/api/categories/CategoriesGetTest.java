package com.bestbuy.api.categories;

import com.bestbuy.api.testbase.TestBaseCategories;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesGetTest extends TestBaseCategories {

    @Test
    public void getAllCatogoriesInfo() {
        Response response = given().
                when().
                get();
        response.then().statusCode(200);
        response.prettyPeek();
        System.out.println(response.statusCode());
    }

    @Test
    public void getSingleProductById() {
        Response response = given()
                .pathParams("id", "abcat0020001")
                .when().get("{id}");
        response.then().statusCode(200);
        response.prettyPrint();
        System.out.println(response.statusCode());
    }

}
