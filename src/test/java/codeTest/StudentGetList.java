package codeTest;

import Base.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StudentGetList extends TestBase {

    @Test
    public void getAllStudentInfo() {
        //Response response=given().when().get("/list");
        //System.out.println("Response is="+response.body().prettyPrint());
        //given().when().get("/list").then().statusCode(200);
        Response response1=given().when().get("/2");
        response1.body().prettyPrint();
        Response response2=
                given().
                        param("programe","Financial Analysis").
                        param("limit",2).
                        when().get("/list");
        System.out.println(response2.prettyPeek());
    }
}

