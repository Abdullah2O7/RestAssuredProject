import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class APITests {
@Test
    public void testGet()
    {
              given()
                      .get("https://dummy.restapiexample.com/api/v1/employees")
                      .then()
                      .assertThat()
                      .body("data[0].id", equalTo(1))
                      .body("data[0].employee_name", equalTo("Tiger Nixon"))
                      .body("data[0].employee_salary", equalTo(320800))
                      .body("data[0].employee_age", equalTo(61))
                      .body("data[0].profile_image", equalTo(""));
    }
    @Test
    public void testGet2()
    {
        given()
                .get("https://dummy.restapiexample.com/api/v1/employee/5")
                 .then()
               .assertThat()
                .body("status", equalTo("success"))
                .body("data.id", equalTo(5))
                .body("data.employee_name", equalTo("Airi Satou"))
                .body("data.employee_salary", equalTo(162700))
                .body("data.employee_age", equalTo(33))
                .body("data.profile_image", equalTo(""))
                .body("message", equalTo("Successfully! Record has been fetched."));
    }
}
