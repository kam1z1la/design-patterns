package com.patern.designpatterns.behaviorall.mediator;

public interface Chat {
    void sendMessage(String text, User user);
    void addUser(User user);
    void deleteUser(User user);
}
