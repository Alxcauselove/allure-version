package utils;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

import static io.restassured.RestAssured.given;


@UtilityClass
public class RequestHelper {

    public static Response getRequest() {

        return given().baseUri("https://yandex.ru/bell/api/v1/get-ticker")
                .filter(new AllureRestAssured())
                .get();
    }
}
