package com.example.ip2;

import static io.restassured.RestAssured.get;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.hamcrest.CoreMatchers;
import org.testng.annotations.Test;

public class Ip2Test {
  private static final String URL = "http://ip.jsontest.com/";
  @Test(groups = {"functional","ip2"})
  @Epic(value = "Strategic")
  @Feature(value = "Accumulation")
  @Step(value = "Given service is up")
  public void checkErrorStatusForURLs() {
    get(URL).then().statusCode(CoreMatchers.equalTo(200));
  }

}
