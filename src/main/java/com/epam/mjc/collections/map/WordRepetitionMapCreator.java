package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if (sentence.isEmpty()) return new HashMap<>();
        Map<String, Integer> map = new HashMap<>();
        sentence = sentence.replace(",","");
        sentence = sentence.replace(".","");

        ArrayList<String> words = new ArrayList<>(Arrays.asList(sentence.toLowerCase().split(" ")));
        for (int i = 0; i < words.size(); i++) {
            if(!map.containsKey(words.get(i))){
                int repeat = 1;
                for (int j = i +1; j < words.size(); j++) {
                    if (words.get(i).equalsIgnoreCase(words.get(j))){
                        repeat++;
                    }
                }
                map.put(words.get(i), repeat);
            }
        }
        return map;
    }
}
