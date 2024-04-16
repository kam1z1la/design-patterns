package com.patern.designpatterns.behaviorall.memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private List<RasterImage.RasterImageMemento> mementos;

    public Memento() {
        this.mementos = new ArrayList<>();
    }

    public void add(RasterImage.RasterImageMemento memento){
        mementos.add(memento);
    }

    public RasterImage get(int index){
        RasterImage.RasterImageMemento memento = mementos.get(index);
        return new RasterImage().restore(memento);
    }
}
