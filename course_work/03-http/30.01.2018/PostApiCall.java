import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import static io.restassured.RestAssured.given;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Map;

import org.testng.annotations.Test;

import com.google.gson.Gson;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class PostApiCall {
  public static String generateJWT(String url, String name, String name2) throws Exception {

  Calendar calendar = Calendar.getInstance();

  java.util.Date current = calendar.getTime();

  RequestSpecification requestspec = given().relaxedHTTPSValidation();


  requestspec = requestspec.header("charset", "UTF-8");
  requestspec = requestspec.header("Content-Type", "application/json");


  JSONObject requestParams = new JSONObject();
  requestParams.put("groovy", url + name + ":" + name2);
  requestspec = requestspec.body(requestParams);
  requestspec = requestspec.log().all();

  // SSLConfig gamma = requestspec.config.SSLConfig("test");

  Response res = requestspec.when().post(url);

  String resFromApi = (res.asString());
  System.out.println(resFromApi);
  System.out.println("THIS IS THE OBJECT RETURNED FROM request   " + res.asString());

  System.out.println(res.statusCode());

  int ApiStatusCode = res.statusCode();
  Object ApiResponseBody = res;

  if (ApiStatusCode != 200) {
   System.out.println("Failed" + resFromApi);
   System.out.println("Status code " + res.statusCode());
   // Assert.assertEquals(res.asString(), "{\"message\":\"JWT no good\"}");
   String results = res.asString();
   return responseFailed;

  } else {

   System.out.println("This is the return Body " + res.body().toString());
   // Assert.assertEquals(res.body(), "hello");
   System.out.println("Test Pass");
   String JWT = res.jsonPath().getString("authorization_Token");
   return JWT;

  }

 }

}
