import jdk.jfr.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class postTest {
    @Test
    public void post1()
    {

       String requestBody = "{\n" +
               "    \"name\": \"Abdallah\",\n" +
               "    \"salary\": 50000,\n" +
               "    \"age\": 25,\n" +
               "    \"id\": 100,\n" +
               "}";
       System.out.println(requestBody);

        given().header("ContentType","application/json")
                .body(requestBody)
                .post("https://dummy.restapiexample.com/api/v1/create")
                .then().assertThat()
                .body("status",equalTo("success"));
    }
}
