package org.grammar.thread;

public interface PostBuilder {
    PostBuilder title(String title);
    PostBuilder content(String content);
    PostBuilder author(String author);
    PostBuilder build();
    String getTitle();
    String getAuthor();
    String getContent();
}