import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class DeleteTest {
    @Test(priority = 1)
    public void delete()
    {
        given().delete("https://dummy.restapiexample.com/public/api/v1/delete/2")
                .then().assertThat()
                .body("status",equalTo("success"))
                .body("message",equalTo("Successfully! Record has been deleted"));
    }

    // Retrieve the deleted record
    @Test(priority = 2)
    public void get()
    {
        given().get("https://dummy.restapiexample.com/public/api/v1/delete/2")
                .then().assertThat()
                .body("message",equalTo("Error Occured! Page Not found, contact rstapi2example@gmail.com"));
    }
}
