package com.patern.designpatterns.behaviorall.mediator;

public class MediatorApplication {
    public static void main(String[] args) {
        UserChat chat = new UserChat();

        User ali = new Programmer(chat, "Ali");
        User mikola = new Tester(chat, "Mikola");
        User alex = new Customer(chat, "Alex");

        chat.addUser(ali);
        chat.addUser(mikola);
        chat.addUser(alex);

        ali.sendMessage("Hi!");
    }
}
