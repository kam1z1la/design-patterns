package com.patern.designpatterns.behaviorall.memento;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MementoApplication {
    public static void main(String[] args) {
        RasterImage image = RasterImage.builder()
                .width(100)
                .height(100)
                .pixels(100)
                .build();

        log.info(image.toString());

        Memento memento = new Memento();
        memento.add(image.save());

        image.setWidth(200);

        log.info(image.toString());

        RasterImage oldImage = memento.get(0);

        log.info(oldImage.toString());
    }
}
