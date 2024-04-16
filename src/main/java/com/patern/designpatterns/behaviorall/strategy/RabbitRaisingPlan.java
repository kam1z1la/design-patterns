package com.patern.designpatterns.behaviorall.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RabbitRaisingPlan implements Plan {
    @Override
    public void formingPlan(String animalName) {
        log.info(String.format("""
                %s Raising Plan:
                Food: Hay, fresh vegetables and fruits, specialized rabbitry. Strategy: “Hay is available around the clock, fresh vegetables and fruits every day, specialized food for rabbits twice a day.”
                Physical activity: Free movement in a specially equipped enclosure, playing with toys. Strategy: “Access to the enclosure for free movement and play with toys for at least 30 minutes every day.”
                Care: Regular cleaning of the cage, care of claws and teeth, regular visits to the veterinarian. Strategy: "Clean the cage every day, trim nails and care for teeth as needed, visit the vet once a year for checkups and vaccinations.
                """, animalName));
    }
}
