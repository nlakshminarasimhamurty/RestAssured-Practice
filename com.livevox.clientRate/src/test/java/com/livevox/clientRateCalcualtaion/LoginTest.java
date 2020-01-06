package com.livevox.clientRateCalcualtaion;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class LoginTest {

	public static FileInputStream fis;
	public static Properties prop;
	public static RestAssured restApi;
	public static Response loginResponce;
	public static Map<String, String> loginCookies;

	@BeforeSuite
	public static Map<String, String> login() {

		try {
			fis = new FileInputStream(new File(".\\src\\test\\resources\\config.properties"));
			prop = new Properties();
			prop.load(fis);
			restApi.baseURI = prop.getProperty("url");
			loginResponce = restApi.given().contentType(ContentType.JSON)
					.queryParam("client_code", prop.getProperty("client_code"))
					.queryParam("user", prop.getProperty("user")).queryParam("pass", prop.getProperty("pass")).when()
					.post("lvp_10.0/login");
			loginCookies = loginResponce.cookies();

			System.out.println(loginCookies);
		} catch (Exception e) {

		}

		return loginCookies;
	}

}
