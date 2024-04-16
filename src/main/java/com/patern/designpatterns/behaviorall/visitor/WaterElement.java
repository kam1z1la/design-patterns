package com.patern.designpatterns.behaviorall.visitor;

public class WaterElement implements Element {
    @Override
    public void accept(Elements elements) {
        elements.walkingOnWater(this);
    }
}

