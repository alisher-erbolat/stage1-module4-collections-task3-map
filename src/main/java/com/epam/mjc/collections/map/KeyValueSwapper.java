package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();

        for (Map.Entry<Integer, String> e : sourceMap.entrySet()){
            if (!map.containsKey(e.getValue())){
                map.put(e.getValue(), e.getKey());
            }
            else{
                if (map.get(e.getValue())>e.getKey()){
                    map.put(e.getValue(), e.getKey());
                }
            }
        }
        return map;
    }
}
