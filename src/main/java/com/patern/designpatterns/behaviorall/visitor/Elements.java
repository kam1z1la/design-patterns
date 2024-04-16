package com.patern.designpatterns.behaviorall.visitor;

public interface Elements {
    void walkingOnLand(LandElement landElement);
    void flyThroughTheAir(AirElement airElement);
    void walkingOnWater(WaterElement waterElement);
}
