package org.example;

public class Main {
    public static void main(String[] args) {
        DefaultPostBuilder postBuilder = new DefaultPostBuilder();
        String title = "빌더패턴에 대해서 알아보자.";
        String content = "오늘은 빌더패턴에 대해서 알아보겠습니다.";
        String author = "이준호";
        DefaultPostBuilder post = postBuilder.builder().title(title).content(content).author(author).build();
        System.out.println(post.getTitle());
        System.out.println(post.getAuthor());
        System.out.println(post.getContent());
    }
}