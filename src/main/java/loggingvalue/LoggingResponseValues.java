package loggingvalue;

import Base.TestBase;
import io.restassured.http.ContentType;
import model.StudentPOJO;
import org.junit.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class LoggingResponseValues extends TestBase {

    @Test
    public void test001(){
        System.out.println("-----Printing Response header-----");
        given().when().get("/list").then().log().headers().statusCode(200);
    }

    @Test
    public void test002(){
        System.out.println("-----Printing Response Status line-----");
        given().when().get("/list").then().log().status().statusCode(200);
    }

    @Test
    public void test003(){
        System.out.println("-----Printing Response Body line-----");
        given().when().get("/list").then().log().body().statusCode(200);
    }

    @Test
    public void test004(){
        System.out.println("-----Printing Response Body in case of error-----");
        given().when().get("/list").then().log().ifValidationFails().statusCode(500);
    }
    @Test
    public void test005(){
        System.out.println("-----Printing Request Post parameter-----");
        given().param("programe","Financial Analysis").
                param("limit",-1).log().params().when().get("/list").then().log().ifError();
    }
}
