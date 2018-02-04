package com.example.ip;

import static io.restassured.RestAssured.get;

import org.hamcrest.CoreMatchers;
import org.testng.annotations.Test;

public class IpTest {
  private static final String URL = "http://ip.jsontest.com/";
  @Test(groups = "ip")
  public void checkErrorStatusForURLs() {
    get(URL).then().statusCode(CoreMatchers.equalTo(200));
  }

}
