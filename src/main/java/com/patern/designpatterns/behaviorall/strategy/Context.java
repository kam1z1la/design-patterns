package com.patern.designpatterns.behaviorall.strategy;

public class Context implements Plan {
    private Plan plan;

    public Context(Plan plan) {
        this.plan = plan;
    }

    @Override
    public void formingPlan(String animalName) {
        plan.formingPlan(animalName);
    }
}
