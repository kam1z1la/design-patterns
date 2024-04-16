package com.patern.designpatterns.behaviorall.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CatRaisingPlan implements Plan {
    @Override
    public void formingPlan(String animalName) {
        log.info(String.format("""
                %s Raising Plan:
                Nutrition: Regular meals, preferably dry or wet cat food. Strategy: "Dry food twice a day, access to water 24 hours a day, extra treats as treats."
                Physical activity: Playing with toys, using cat trees for exercise. Strategy: "Play with toys every day for 20-30 minutes, use the cat tree for exercise and games."
                Care: Daily combing of the coat, litter box care, regular visits to the veterinarian. Strategy: "Brush the coat every day, clean the litter box twice a day, visit the vet once a year for checkups and vaccinations.
                """, animalName));
    }
}
