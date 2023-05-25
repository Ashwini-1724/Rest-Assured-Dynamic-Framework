package requestRepositoryPackage;

import java.io.IOException;
import java.util.ArrayList;

import commonFunctionsPackage.Utility_CommonFunction;

public class post_req_repository {
	
public static String base_URI() {
	String BaseURI="https://reqres.in/";
	
	return BaseURI;
	
}

public static String post_resource() {
	String resource="/api/users";
	return resource;
}
public static String post_tc_1() throws IOException {
ArrayList<String> data=Utility_CommonFunction.readdataexcel("Post_Test_Data","Post_TC_1");
String req_name=data.get(1);
String req_job=data.get(2);
	String requestBody="{\r\n"
			+ "    \"name\": \""+req_name+"\",\r\n"
			+ "    \"job\": \""+req_job+"\"\r\n"
			+ "}";
	return requestBody;
    }

public static String post_tc_2() throws IOException {
ArrayList<String> data=Utility_CommonFunction.readdataexcel("Post_Test_Data","Post_TC_2");
String req_name=data.get(1);
String req_job=data.get(2);
	String requestBody="{\r\n"
			+ "    \"name\": \""+req_name+"\",\r\n"
			+ "    \"job\": \""+req_job+"\"\r\n"
			+ "}";
	return requestBody;
    }

public static String post_tc_3() throws IOException {
ArrayList<String> data=Utility_CommonFunction.readdataexcel("Post_Test_Data","Post_TC_3");
String req_name=data.get(1);
String req_job=data.get(2);
	String requestBody="{\r\n"
			+ "    \"name\": \""+req_name+"\",\r\n"
			+ "    \"job\": \""+req_job+"\"\r\n"
			+ "}";
	return requestBody;
    }

}
