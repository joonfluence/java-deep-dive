package org.example;

public interface PostBuilder {
    PostBuilder title(String title);
    PostBuilder content(String content);
    PostBuilder author(String author);
    DefaultPostBuilder build();
}