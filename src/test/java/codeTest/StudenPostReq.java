package codeTest;

import Base.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import model.StudentPOJO;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class StudenPostReq extends TestBase {


    @Test
    public void createStudentinfo(){
        ArrayList<String> courses=new ArrayList<>();
        courses.add("Java");
        courses.add("Python");

        StudentPOJO studentPOJO=new StudentPOJO();
        studentPOJO.setFirstName("Suraj");
        studentPOJO.setLastName("Salunkhe");
        studentPOJO.setEmail("sun@sun.com");
        studentPOJO.setProgramme("ComputerProgram");
        studentPOJO.setCourses(courses);
        given().contentType(ContentType.JSON).when().body(studentPOJO).post().then().statusCode(201);

    }

}
