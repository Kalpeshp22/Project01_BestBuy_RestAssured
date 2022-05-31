package com.bestbuy.api.products;

import com.bestbuy.api.model.ProductPojo;
import com.bestbuy.api.testbase.TestBaseProducts;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductPostTest extends TestBaseProducts {

    @Test
    public void createNewProduct(){
        ProductPojo productPojo = new ProductPojo();

        productPojo.setName("Iphone 120 ultra max pro lite");
        productPojo.setType("Phone");
        productPojo.setPrice(10000d);
        productPojo.setShipping(100);
        productPojo.setUpc("41564649812");
        productPojo.setDescription("2022 Apple Iphone 120 ultra max pro lite");
        productPojo.setManufacturer("Apple");
        productPojo.setModel("120 ultra max pro lite");
        productPojo.setUrl("new.png");
        productPojo.setImage("new.png");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(productPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPeek();





    }

}
