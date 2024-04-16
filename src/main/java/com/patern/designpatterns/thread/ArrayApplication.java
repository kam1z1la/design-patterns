package com.patern.designpatterns.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@Slf4j
public class ArrayApplication {
    public static void main(String[] args) {
        List<Integer> array =new LinkedList<>();

        log.info("Fill the array");
        try(Scanner scanner =  new Scanner(System.in)) {
            while (array.size() <= 5) {
                if (scanner.hasNextInt()) {
                    array.add(scanner.nextInt());
                }
            }
        }

        log.info("Min: "+array.stream().min(Integer::compareTo).get());
        log.info("Max: "+array.stream().max(Integer::compareTo).get());
    }
}
