package com.lwu.boot.model;

/**
 * Created by lwu on 9/2/16.
 */
public class Greeting {

    private long id;
    private String content;

    public Greeting(long id, String Content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
