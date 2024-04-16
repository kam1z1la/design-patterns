package com.patern.designpatterns.behaviorall.visitor;

public class VisitorApplication {
    public static void main(String[] args) {
        Elements hero = new Hero();
        Move move = new Move();
        move.accept(hero);
    }
}
