package com.bestbuy.api.products;

import com.bestbuy.api.model.ProductPojo;
import com.bestbuy.api.testbase.TestBaseProducts;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductPatchTest extends TestBaseProducts {

    @Test
    public void updateProduct(){
        ProductPojo productPojo = new ProductPojo();

        productPojo.setName("Iphone 120 ultra max pro lite v.2");
        productPojo.setType("Phone");
        productPojo.setPrice(10000d);
        productPojo.setShipping(100);
        productPojo.setUpc("41564649812");
        productPojo.setDescription("2022 Apple Iphone 120 ultra max pro lite v.2");
        productPojo.setManufacturer("Apple");
        productPojo.setModel("120 ultra max pro lite");
        productPojo.setUrl("new.png");
        productPojo.setImage("new.png");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(productPojo)
                .pathParams("id", 9999687)
                .when()
                .patch("{id}");
        response.prettyPeek();

    }
}
