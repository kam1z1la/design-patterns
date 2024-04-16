package com.patern.designpatterns.behaviorall.mediator;

import java.util.ArrayList;
import java.util.List;

public class UserChat implements Chat {
    private List<User> users;

    public UserChat() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String text, User user) {
        users.forEach(use -> {
            if (!use.equals(user))
                use.receive(text);
        });
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void deleteUser(User user) {
        users.remove(user);
    }
}
