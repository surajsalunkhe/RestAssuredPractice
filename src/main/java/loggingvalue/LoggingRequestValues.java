package loggingvalue;

import Base.TestBase;
import io.restassured.http.ContentType;
import model.StudentPOJO;
import org.junit.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class LoggingRequestValues extends TestBase {

    @Test
    public void test001(){
        System.out.println("-----Printing Request Header-----");
        given().log().headers().when().get("/1").then().statusCode(200);
    }

    @Test
    public void test002(){
        System.out.println("-----Printing Request Post parameter-----");
        given().param("programe","Financial Analysis").
                param("limit",2).log().params().when().get("/list").then().statusCode(200);
    }

    @Test
    public void  test003(){
        System.out.println("-----Printing All request Body -----");
        ArrayList<String> courses=new ArrayList<>();
        courses.add("Java");
        courses.add("Python");

        StudentPOJO studentPOJO=new StudentPOJO();
        studentPOJO.setFirstName("Sun");
        studentPOJO.setLastName("Salunkhe");
        studentPOJO.setEmail("sun145@sun.com");
        studentPOJO.setProgramme("ComputerProgram");
        studentPOJO.setCourses(courses);
        given().contentType(ContentType.JSON).log().body().
                when().body(studentPOJO).post().then().statusCode(201);
    }

    @Test
    public void  test004(){
        System.out.println("-----Printing All request Body -----");
        ArrayList<String> courses=new ArrayList<>();
        courses.add("Java");
        courses.add("Python");

        StudentPOJO studentPOJO=new StudentPOJO();
        studentPOJO.setFirstName("Super");
        studentPOJO.setLastName("duper");
        studentPOJO.setEmail("su113@sun.com");
        studentPOJO.setProgramme("ComputerProgram");
        studentPOJO.setCourses(courses);
        given().contentType(ContentType.JSON).log().all().
                when().body(studentPOJO).post().then().statusCode(201);
    }

    @Test
    public void  test005(){
        System.out.println("-----Printing All request if validation fail Body -----");
        ArrayList<String> courses=new ArrayList<>();
        courses.add("Java");
        courses.add("Python");

        StudentPOJO studentPOJO=new StudentPOJO();
        studentPOJO.setFirstName("Super");
        studentPOJO.setLastName("duper");
        studentPOJO.setEmail("sun6@sun.com");
        studentPOJO.setProgramme("ComputerProgram");
        studentPOJO.setCourses(courses);
        given().contentType(ContentType.JSON).log().ifValidationFails().
                when().body(studentPOJO).post().then().statusCode(201);
    }
}
