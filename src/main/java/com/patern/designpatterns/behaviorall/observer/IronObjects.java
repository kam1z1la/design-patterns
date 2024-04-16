package com.patern.designpatterns.behaviorall.observer;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Builder
public class IronObjects implements Objects {
    private String name;
    private double radius;

    @Override
    public void notification() {
        log.info(String.format("Object called %s attached to a magnet", name));
    }
}
