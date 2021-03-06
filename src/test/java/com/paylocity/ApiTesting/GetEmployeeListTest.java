package com.paylocity.ApiTesting;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;


public class GetEmployeeListTest {

    @BeforeAll

    public static void init() {
        baseURI =
                "https://wmxrwq14uc.execute-api.us-east-1.amazonaws.com";
        basePath =
                "Prod/api/employees";
    }

    @AfterAll
    public static void cleanup() {

        RestAssured.reset();
    }
            @DisplayName("Get Employee List")
                    @Test
public void test1(){


                    given()
                    .header("Authorization", "Basic VGVzdFVzZXI0OTpHI18wJEFfbWpwNC0=")
                    .when().get()
                    .then().log().all().statusCode(200);

        }
}
