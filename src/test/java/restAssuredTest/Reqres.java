package restAssuredTest;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.devtools.v112.fetch.model.AuthChallengeResponse;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.*;

public class Reqres {

    @Test
public void listUsers() {
/*
 given () [pre-condition] we keep----baseURI, Header, query parameter, authentication.
 When () [Action] We keep ----the get/post/put/delete method with end point + body.
 then () [Validation] We keep ----we can log all in the response body + we can extract...
 */


        Response res = given() //pre-condition

                .baseUri("https://reqres.in")
                .queryParam("page", 2)
                .when() // Action
                .get("api/users")
                .then()// Validation
                 .log()
                .all()
                .assertThat()
                .statusCode(200)
                .extract().response();
    /*
    We have to parse the data after extracting ....
    For data parsing tools (Breaking the code), I use is called JsonPath. JasonPath is a class from restAssured.
     */

        JsonPath js = res.jsonPath(); // Jason Path will break the response.

        String number = js.getString("page");
        System.out.println(number);

        //Assert.assertEquals(2,number); //Validating
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(number,2);

        String total = js.getString("total");
        soft.assertEquals(total,11);

        System.out.println("Ending of soft assert");

        //soft.assertAll(); // Now it will show all the issues on the console..


    }







}
