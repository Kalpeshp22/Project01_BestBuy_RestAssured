package com.bestbuy.api.categories;

import com.bestbuy.api.model.CategoryPojo;
import com.bestbuy.api.testbase.TestBaseCategories;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesPatchTest extends TestBaseCategories {

    @Test
    public void updateCategoriesBasedOnId(){

        CategoryPojo categoryPojo = new CategoryPojo();

        categoryPojo.setName("Number");

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParams("id","abc007")
                .body(categoryPojo)
                .when()
                .patch("{id}");
        response.then().statusCode(200);
        response.prettyPrint();
        System.out.println(response.statusCode());





    }
}
