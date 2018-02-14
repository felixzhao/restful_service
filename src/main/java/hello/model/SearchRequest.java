package hello.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by qzhao on 2018/2/14.
 */
public class SearchRequest {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
