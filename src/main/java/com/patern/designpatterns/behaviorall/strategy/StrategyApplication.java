package com.patern.designpatterns.behaviorall.strategy;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class StrategyApplication {
    public static void main(String[] args) {
        log.info("Enter the name of the animal");

        try (Scanner scanner = new Scanner(System.in)) {
            String animalName = scanner.nextLine();
            switch (animalName) {
               case "dog" -> {
                   Plan dogRaisingPlan = new DogRaisingPlan();
                   Context context = new Context(dogRaisingPlan);
                   context.formingPlan(animalName);
               }
                case "cat" -> {
                    Plan dogRaisingPlan = new CatRaisingPlan();
                    Context context = new Context(dogRaisingPlan);
                    context.formingPlan(animalName);
                }
                case "rabbit" -> {
                    Plan dogRaisingPlan = new RabbitRaisingPlan();
                    Context context = new Context(dogRaisingPlan);
                    context.formingPlan(animalName);
                }
                default -> log.warn("Plans for this animal are not available");
            }
        }
    }
}
