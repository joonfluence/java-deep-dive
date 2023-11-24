package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.grammar.thread.Post;
import org.grammar.thread.PostBuilder;

class PostTest {

    @DisplayName("")
    @Test
    void test(){
        // given
        String title = "빌더패턴에 대해서 알아보자.";
        String content = "오늘은 빌더패턴에 대해서 알아보겠습니다.";
        String author = "이준호";

        PostBuilder post = Post.builder().title(title).content(content).author(author).build();
        System.out.println(post.getTitle());
        System.out.println(post.getAuthor());
        System.out.println(post.getContent());

        Post postSetter = new Post();
        postSetter.setTitle(title);
        postSetter.setContent(content);
        postSetter.setAuthor(author);
        System.out.println(postSetter.getTitle());
        System.out.println(postSetter.getAuthor());
        System.out.println(postSetter.getContent());

        // when
        // then
    }
}