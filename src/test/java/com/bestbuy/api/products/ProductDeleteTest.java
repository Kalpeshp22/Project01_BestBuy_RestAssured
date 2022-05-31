package com.bestbuy.api.products;

import com.bestbuy.api.testbase.TestBaseProducts;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductDeleteTest extends TestBaseProducts {

    @Test
    public void deleteProduct(){
        Response response = given()
                .pathParams("id",9999687)
                .when()
                .delete("{id}");
        response.prettyPeek();
        response.then().statusCode(200);
    }
}
