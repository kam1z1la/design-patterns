package com.patern.designpatterns.behaviorall.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DogRaisingPlan implements Plan {
    @Override
    public void formingPlan(String animalName) {
        log.info(String.format("""
                %s Raising Plan:
                Feeding: Regular meals including dry food, wet food and extra treats for reward. Strategy: "Dry food in the morning and evening, wet food in the middle of the day, treats to reward good behavior."
                Physical activity: Walking, playing outdoors, training. Strategy: “Walk twice a day for 30 minutes, play with a ball or frisbee in the yard, train in teams every day for 15 minutes.”
                Grooming: Daily brushing of the coat, bathing as needed, regular visits to the veterinarian for examinations and vaccinations. Strategy: "Brush daily, bathe once a month or as needed, visit veterinarian every 6 months for checkup and vaccination.
                """, animalName));
    }
}
