import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;


public class TestsPostman {

    private final static String BASE_URI = "https://postman-echo.com";
    private final String TEST_TEXT = "This is expected to be sent back as part of response body.";

    @BeforeEach
    public void init() {
        RestAssured.baseURI = BASE_URI;
    }

    @Test
    @DisplayName("GET")
    public void getRequest() {
        given()
                .when().get("/get?foo1=bar1&foo2=bar2")
                .then()
                .assertThat().statusCode(200)
                .and().body("args.foo1", is("bar1"))
                .and().body("args.foo2", is("bar2"));
    }

    @Test
    @DisplayName("POST Raw Text")
    public void postRawText() {
        given()
                .body(TEST_TEXT)
                .when().post("/post")
                .then()
                .assertThat().statusCode(200)
                .and().body("data", is(TEST_TEXT));
    }

    @Test
    @DisplayName("POST Form Data")
    public void postFormData() {
        given()
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .header("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
                .when().post("/post")
                .then()
                .assertThat().statusCode(200)
                .and().body("form.foo1", is("bar1"))
                .and().body("form.foo2", is("bar2"));
    }

    @Test
    @DisplayName("PUT")
    public void putRequest() {
        given()
                .body(TEST_TEXT)
                .when().put("/put")
                .then()
                .assertThat().statusCode(200)
                .and().body("data", is(TEST_TEXT));
    }

    @Test
    @DisplayName("PATCH")
    public void patchRequest() {
        given()
                .body(TEST_TEXT)
                .when().patch("/patch")
                .then()
                .assertThat().statusCode(200)
                .and().body("data", is(TEST_TEXT));
    }

    @Test
    @DisplayName("DELETE Request")
    public void deleteRequest() {
        given()
                .body(TEST_TEXT)
                .when().delete("/delete")
                .then()
                .assertThat().statusCode(200)
                .and().body("data", is(TEST_TEXT));
    }
}
