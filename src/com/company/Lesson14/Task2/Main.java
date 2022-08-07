package com.company.Lesson14.Task2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Integer[] mass = new Integer[] {1, 2, 5, 7, 40, 3, 2, 7, 2, 1};

        Map<Integer, Integer> counter = new TreeMap<>();
        Map.Entry<Integer, Integer> maxEntry = null;

        for (int mas : mass){
            if(counter.get(mas) == null){
                counter.put(mas, 1);
            } else {
                counter.replace(mas, counter.get(mas)+1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = counter.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries){
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
                maxEntry = entry;
            }
        }
        assert maxEntry != null;
        System.out.println("Значение " + maxEntry.getKey() + " чаще всего встречается в массиве");

    }

}
