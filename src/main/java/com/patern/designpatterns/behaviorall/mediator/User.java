package com.patern.designpatterns.behaviorall.mediator;

public abstract class User {
    protected Chat chat;
    protected String name;

    public User(Chat chat, String name){
        this.chat = chat;
        this.name = name;
    }

    public abstract void sendMessage(String text);
    public abstract void receive(String text);
}
