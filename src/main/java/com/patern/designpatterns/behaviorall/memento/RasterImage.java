package com.patern.designpatterns.behaviorall.memento;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class RasterImage {
    private int width;
    private int height;
    private int pixels;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public static class RasterImageMemento {
        private int width;
        private int height;
        private int pixels;

        public RasterImageMemento(RasterImage image) {
            this.width = image.getWidth();
            this.height = image.getHeight();
            this.pixels = image.getPixels();
        }
    }

    public RasterImageMemento save() {
        return new RasterImageMemento(this);
    }

    public RasterImage restore(RasterImageMemento memento) {
        return RasterImage.builder()
                .height(memento.height)
                .width(memento.width)
                .pixels(memento.pixels)
                .build();
    }
}
