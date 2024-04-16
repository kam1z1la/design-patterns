package com.patern.designpatterns.behaviorall.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Programmer extends User {

    public Programmer(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void sendMessage(String text) {
        chat.sendMessage(text, this);
    }

    @Override
    public void receive(String text) {
        log.info("The message has been sent " + name + "\n" + text);
    }
}
