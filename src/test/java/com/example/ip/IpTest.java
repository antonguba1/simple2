package com.example.ip;

import static io.restassured.RestAssured.get;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.hamcrest.CoreMatchers;
import org.testng.annotations.Test;

public class IpTest {
  private static final String URL = "http://ip.jsontest.com/";
  @Test(groups = {"functional","ip"})
  @Epic(value = "Strategic")
  @Feature(value = "Accumulation")
  @Step(value = ""+
      "Given request\n" +
      "When request\n" +
      "Then asdasd\n")
  public void checkErrorStatusForURLs() {
    get(URL).then().statusCode(CoreMatchers.equalTo(200));
  }

}
