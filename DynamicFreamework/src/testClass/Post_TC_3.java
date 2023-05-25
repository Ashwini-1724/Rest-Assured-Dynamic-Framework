package testClass;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.time.LocalDate;

import org.testng.Assert;

import commonFunctionsPackage.API_Common_Function;
import commonFunctionsPackage.Utility_CommonFunction;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import requestRepositoryPackage.post_req_repository;

public class Post_TC_3 {

	public static void execute() throws IOException {
  for(int i=0 ; i<5 ;i++)
  {
		int res_status_Code = API_Common_Function.response_statusCode(post_req_repository.base_URI(),
				post_req_repository.post_resource(), post_req_repository.post_tc_3());
		System.out.println("Status code :- "+res_status_Code);
		if(res_status_Code == 201)
	   {

		String res_Body = API_Common_Function.responseBody(post_req_repository.base_URI(),
				post_req_repository.post_resource(), post_req_repository.post_tc_3());
		System.out.println("responseBody :- "+res_Body);
	
    Utility_CommonFunction.evidencefilecreator("Post_TC_3",post_req_repository.post_tc_3(),res_Body);
		break;
       }
       else
       {
 	  System.out.println("correct status code is not found hence retrying the API");
       }
	
	   }
	
}
	
	
public static void validator(String res_Body,int res_status_Code) {
		
		//Step 4 : Parse the response body and request body
		String requestBody="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}" ;   
		   
			JsonPath jsp = new JsonPath(res_Body);
		    String res_name = jsp.getString("name");
		    String res_job = jsp.getString("job");
		    String res_id = jsp.getString("id");
		    String res_createdAt = jsp.getString("createdAt");
		    System.out.println(res_name);
		    System.out.println(res_job);
		    System.out.println(res_id);
		    System.out.println(res_createdAt);
		   
		    JsonPath jsprequest =new JsonPath(requestBody);
		    String req_name = jsprequest.getString("name");
		    String req_job = jsprequest.getString("job");
		    String req_id = jsprequest.getString("req_id");
		    String req_createdAt = jsp.getString("req_createdAt");
		    
		    //step 5 : Validate response body parameters
		    
		    Assert.assertEquals(res_status_Code, 201);
		    Assert.assertEquals(res_name, req_name);
		    Assert.assertEquals(res_job, req_job);
		    Assert.assertNotNull(res_id, req_id);
		    Assert.assertNotNull(res_createdAt, req_createdAt);
            
			}

	}
		

