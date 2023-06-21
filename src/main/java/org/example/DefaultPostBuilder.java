package org.example;

public class DefaultPostBuilder implements PostBuilder{
    private String title;
    private String content;
    private String author;

    public DefaultPostBuilder(){}

    public DefaultPostBuilder builder(){
        return new DefaultPostBuilder();
    }

    @Override
    public PostBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public PostBuilder content(String content) {
        this.content = content;
        return this;
    }

    @Override
    public PostBuilder author(String author) {
        this.author = author;
        return this;
    }

    public DefaultPostBuilder build(){
        return this;
    }

    public String getTitle(){
        return this.title;
    }

    public String getContent(){
        return this.content;
    }

    public String getAuthor(){
        return this.author;
    }
}
