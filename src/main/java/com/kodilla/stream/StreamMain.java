package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import java.util.stream.Collectors;
import com.kodilla.stream.forumuser.*;
import java.util.Map;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> theForum = forum.getUserList().stream()
                .filter( user -> user.getSex() == 'M')
                .filter(user -> user.getBirthDate().getYear() < 2003)
                .filter(user -> user.getNumberOfPublishedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID,user -> user));
        System.out.println("Here we go: " + theForum.size());
        theForum.entrySet().stream()
                .map( integerForumUserEntry -> integerForumUserEntry.getKey() + " " + integerForumUserEntry.getValue())
                .forEach(System.out::println);
    }
}