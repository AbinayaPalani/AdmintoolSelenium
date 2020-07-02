package com.admintool;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APICalls {
	
	public static Response getUserByAccountPin;
	public static JSONObject getUserByAccountPinJson, userObject, primaryDetails,CommunicationAddressObject;
	public static String CompanyName, primaryAccountNumber, CustomerStatus;
	
	static{
		RestAssured.baseURI = "https://staging.jbilling.a-cti.com:8443";
	}
	
	@Test
	public static void getUserByAccountPin(){
		
		
		getUserByAccountPin		=		RestAssured.given().contentType(ContentType.JSON)
										.pathParam("accountPin", "ecadb55c-31ab-49fd-b569-528c63e60431")
										.pathParam("brandId","12069e64-bd54-4ba9-97f7-249f62cc8178")
										.accept(ContentType.JSON)
										.get("/v1/getUserByAccountPin/accountPin/{accountPin}/brandId/{brandId}");	 	
		
		 getUserByAccountPinJson = new JSONObject(getUserByAccountPin.asString());
		
		 userObject = (JSONObject) getUserByAccountPinJson.get("user");
		 
		
		 
		 System.out.println(userObject);
		 
		CommunicationAddressObject =  (JSONObject) userObject.get("communicationAddress");
		
		CompanyName =  CommunicationAddressObject.getString("Statement Name 1");
		 
		 System.out.println(CompanyName);
		 
		 primaryDetails = (JSONObject) userObject.get("primaryDetails");
		 
		 primaryAccountNumber =  primaryDetails.getString("primaryAccountNumber");
		 
		 CustomerStatus = userObject.getString("status");
		 
		 
		 
		 
		 
		 
		
		
		

	}

}
