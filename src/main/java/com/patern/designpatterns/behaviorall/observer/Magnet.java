package com.patern.designpatterns.behaviorall.observer;

import java.util.LinkedList;
import java.util.List;

public class Magnet {
    private final double radius;
    private List<IronObjects> ironObjects;

    public Magnet(double radius) {
        this.radius = radius;
        this.ironObjects = new LinkedList<>();
    }

    public void subscribe(IronObjects object) {
        if (object.getRadius() <= radius)
            ironObjects.add(object);
    }

    public void unsubscribe(IronObjects object) {
        ironObjects.remove(object);
    }

    public void notifyMagnet() {
        ironObjects.forEach(IronObjects::notification);
    }
}
