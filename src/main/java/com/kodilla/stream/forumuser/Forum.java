package com.kodilla.stream.forumuser;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();
    public Forum(){
        userList.add(new ForumUser(1111, "Trututut", 'M', 123, LocalDate.of(1994, 5,13) ));
        userList.add(new ForumUser(1112, "Sruuuu", 'F', 12, LocalDate.of(1976, 4,4) ));
        userList.add(new ForumUser(1113, "Fruruut", 'M', 4, LocalDate.of(1969, 2,14) ));
        userList.add(new ForumUser(1114, "Srutututu", 'F', 23, LocalDate.of(2008, 3,16) ));
        userList.add(new ForumUser(1115, "Srutu", 'M', 73, LocalDate.of(2005, 1,25) ));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
