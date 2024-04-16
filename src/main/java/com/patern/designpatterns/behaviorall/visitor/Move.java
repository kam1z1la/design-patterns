package com.patern.designpatterns.behaviorall.visitor;

import java.util.ArrayList;
import java.util.List;

public class Move implements Element {
    private List<Element> list;

    public Move() {
        this.list = new ArrayList<>();
        list.add(new WaterElement());
        list.add(new AirElement());
        list.add(new LandElement());
    }

    @Override
    public void accept(Elements elements) {
        list.forEach(element -> element.accept(elements));
    }
}