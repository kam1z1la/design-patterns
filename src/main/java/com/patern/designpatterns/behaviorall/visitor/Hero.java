package com.patern.designpatterns.behaviorall.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hero implements Elements {
    @Override
    public void walkingOnLand(LandElement landElement) {
        log.info("hero walking on land");
    }

    @Override
    public void flyThroughTheAir(AirElement airElement) {
        log.info("hero fly through the air");
    }

    @Override
    public void walkingOnWater(WaterElement waterElement) {
        log.info("hero walking on water");
    }
}