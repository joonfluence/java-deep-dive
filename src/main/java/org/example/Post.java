package org.example;

public class Post implements PostBuilder{
    private String title;
    private String content;
    private String author;

    public Post(){}

    static Post builder(){
        return new Post();
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

    public Post build(){
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

    public void setTitle(String title){
        this.title = title;
    }
    public void setContent(String content){
        this.content = content;
    }
    public void setAuthor(String author){
        this.author = author;
    }

}
