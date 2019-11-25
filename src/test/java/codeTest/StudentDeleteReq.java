package codeTest;

import Base.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import model.StudentPOJO;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class StudentDeleteReq extends TestBase {

    @Test
    public void deleteStudentinfo(){
        given().when().delete("/101").then().statusCode(204);


    }
}
