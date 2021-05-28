package jsonplaceholder;

import client.RestClient;
import dtos.jsonplaceholder.Post;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.List;

/**
 * An example Test class describing how to use the framework to write tests
 */
public class PostTests {
    private static final Logger logger = LoggerFactory.getLogger(PostTests.class);

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    private static final String POSTS_ENDPOINT = BASE_URL + "/posts";

    private RestClient client = new RestClient();

    /**
     * Make a call to <strong>/posts</strong> endpoint and print all returned posts
     */
    @Test
    public void getPosts() {
        List<Post> posts = client.get(POSTS_ENDPOINT, List.class);
        logger.info(() -> "Posts: " + posts);
    }

    /**
     * Make a call to <strong>/posts</strong> endpoint and verify that the status code in the response is <strong>200</strong>
     */
    @Test
    public void getPostsWithAssertion() {
        Response response = client.get(POSTS_ENDPOINT, Response.class);
        Assertions.assertEquals(200, response.getStatusCode(), "Expected Status Code Failure");
    }
}
