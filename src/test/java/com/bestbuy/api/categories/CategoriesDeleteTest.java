package com.bestbuy.api.categories;

import com.bestbuy.api.testbase.TestBaseCategories;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesDeleteTest extends TestBaseCategories {

    @Test
    public void deleteCategories(){
        Response response = given()
                .pathParams("id", "abc007")
                .when()
                .delete("{id}");
        response.prettyPeek();
        response.then().statusCode(200);
        System.out.println(response.statusCode());
    }
}
