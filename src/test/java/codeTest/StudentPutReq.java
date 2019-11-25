package codeTest;

import Base.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import model.StudentPOJO;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class StudentPutReq extends TestBase {

    @Test
    public void updateStudentinfo(){
        ArrayList<String> courses=new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("C#");

        StudentPOJO studentPOJO=new StudentPOJO();
        studentPOJO.setFirstName("Suraj");
        studentPOJO.setLastName("Salunkhe");
        studentPOJO.setEmail("sun@sun.com");
        studentPOJO.setProgramme("Computer Program");
        studentPOJO.setCourses(courses);
        given().contentType(ContentType.JSON).when().body(studentPOJO).put("/101").then().statusCode(200);

    }
}
