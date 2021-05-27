package client;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestClient {

    private final int connectionTimeout = 60000;
    private final int socketTimeout = 60000;

    private RequestSpecification requestSpecification;

    static {
        RestAssured.defaultParser = Parser.JSON;
        RestAssured.config = RestAssuredConfig.config().objectMapperConfig(new ObjectMapperConfig());
    }

    public RestClient() {
        RequestSpecBuilder requestSpecBuilder = getDefaultRequestSpecBuilder();
        requestSpecification = RestAssured.given()
            .spec(requestSpecBuilder.build())
            .redirects()
            .follow(true)
            .request();
    }

    public <T> T get(String endpoint, Class<T> returnType) {
        return resultOf(sendRequestAndGetResponse(endpoint, HttpRequestType.GET), returnType);
    }

    public <T> T post(String endpoint, Class<T> returnType) {
        return resultOf(sendRequestAndGetResponse(endpoint, HttpRequestType.POST), returnType);
    }

    public <T> T delete(String endpoint, Class<T> returnType) {
        return resultOf(sendRequestAndGetResponse(endpoint, HttpRequestType.DELETE), returnType);
    }

    public <T> T put(String endpoint, Class<T> returnType) {
        return resultOf(sendRequestAndGetResponse(endpoint, HttpRequestType.PUT), returnType);
    }

    public <T> T patch(String endpoint, Class<T> returnType) {
        return resultOf(sendRequestAndGetResponse(endpoint, HttpRequestType.PATCH), returnType);
    }

    private <T> T resultOf(Response response, Class<T> returnType) {
        return returnType != null ? response.as(returnType) : null;
    }

    private Response sendRequestAndGetResponse(String endpoint, HttpRequestType requestType) {
        switch (requestType) {
            case POST:
                return requestSpecification.when().post(endpoint).andReturn();
            case DELETE:
                return requestSpecification.when().delete(endpoint).andReturn();
            case PUT:
                return requestSpecification.when().put(endpoint).andReturn();
            case PATCH:
                return requestSpecification.when().patch(endpoint).andReturn();
            case GET:
            default:
                return requestSpecification.when().get(endpoint).andReturn();
        }
    }

    private RequestSpecBuilder getDefaultRequestSpecBuilder() {
        return new RequestSpecBuilder()
            .setConfig(RestAssuredConfig.config().httpClient(
                HttpClientConfig.httpClientConfig()
                    .setParam("http.connection.timeout", connectionTimeout)
                    .setParam("http.socket.timeout", socketTimeout)))
            .setContentType(ContentType.JSON);
    }
}
