package com.patern.designpatterns.thread.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortApplication {
    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort(10000, -100, 100);
        InsertionSort insertion = new InsertionSort(10000, -100, 100);
        SelectionSort selection = new SelectionSort(10000, -100, 100);

        System.out.println(Arrays.asList(bubble, insertion, selection)
                .parallelStream()
                .map(Sort::execute)
                .collect(Collectors.toList()));
    }
}
