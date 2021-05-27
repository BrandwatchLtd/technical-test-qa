package dtos.jsonplaceholder;

import dtos.common.BaseModel;

public class Post extends BaseModel<Post> {

    private String title;
    private String body;
    private Integer userId;

    public String getTitle() {
        return title;
    }

    public Post setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public Post setBody(String body) {
        this.body = body;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Post setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }
}
