package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String username;
    private final char sex;
    private final int numberOfPublishedPosts;
    private final LocalDate birthDate;
    public ForumUser(int userID, String username, char sex, int numberOfPublishedPosts, LocalDate birthDate) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.numberOfPublishedPosts = numberOfPublishedPosts;
        this.birthDate = birthDate;
    }
    public int getUserID() {
        return userID;
    }
    public String getUsername() {
        return username;
    }
    public char getSex() {
        return sex;
    }
    public int getNumberOfPublishedPosts() {
        return numberOfPublishedPosts;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", numberOfPublishedPosts=" + numberOfPublishedPosts +
                ", birthDate=" + birthDate +
                '}';
    }
}
