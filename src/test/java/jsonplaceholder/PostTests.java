package jsonplaceholder;

import client.RestClient;
import dtos.jsonplaceholder.Post;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.List;

public class PostTests {
    private static final Logger logger = LoggerFactory.getLogger(PostTests.class);

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    private static final String POSTS_ENDPOINT = BASE_URL + "/posts";

    private RestClient client = new RestClient();

    @Test
    public void getPosts() {
        List<Post> posts = client.get(POSTS_ENDPOINT, List.class);
        logger.info(() -> "Posts: " + posts);

    }
}
