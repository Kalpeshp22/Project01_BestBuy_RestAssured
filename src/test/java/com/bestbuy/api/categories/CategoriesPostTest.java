package com.bestbuy.api.categories;

import com.bestbuy.api.model.CategoryPojo;
import com.bestbuy.api.testbase.TestBaseCategories;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesPostTest extends TestBaseCategories {

    @Test
    public void createNewCategories(){

        CategoryPojo categoryPojo = new CategoryPojo();

        categoryPojo.setName("NewMac");
        categoryPojo.setId("abc007");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(categoryPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPeek();
        System.out.println(response.statusCode());





    }

}
