package com.patern.designpatterns.behaviorall.visitor;

public class AirElement implements Element {
    @Override
    public void accept(Elements elements) {
        elements.flyThroughTheAir(this);
    }
}