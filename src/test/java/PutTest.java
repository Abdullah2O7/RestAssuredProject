import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class PutTest {
    @Test
    public void put1()
    {
        String requestBody = "{\n" +
                "    \"name\": \"Ahmed\",\n" +
                "    \"salary\": 600450,\n" +
                "    \"age\": 21,\n" +
                "    \"id\": 79 ,\n" +
                "}";

        given().header("Content_Type","application/json")
                .body(requestBody)
                .put("https://dummy.restapiexample.com/public/api/v1/update/21")
                .then().assertThat()
                .body("status",equalTo("success"));
    }
}
