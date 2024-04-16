package com.patern.designpatterns.behaviorall.visitor;

public class LandElement implements Element {
    @Override
    public void accept(Elements elements) {
        elements.walkingOnLand(this);
    }
}
