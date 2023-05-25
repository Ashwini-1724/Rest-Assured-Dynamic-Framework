package commonFunctionsPackage;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import requestRepositoryPackage.post_req_repository;

public class API_Common_Function {

public static int response_statusCode(String baseURI,String resource,String requestBody) {
	
	
	RestAssured.baseURI=baseURI;

	int statusCode = given().header("Content_Type","application/json").body(requestBody)
			.when().post(resource).then().extract().statusCode();
	
	return statusCode;
}
		
public static String responseBody(String baseURI, String resource, String requestBody) {

	RestAssured.baseURI = baseURI;

	String responseBody = given().header("content-type", "application/json").body(requestBody)
			.when().post(resource)
			.then().extract().response().asString();

	return responseBody;
	
	
	
    }
}
