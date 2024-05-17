package Chuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Slide99Chuong4 {
    public static void main(String[] args) {
        TreeMap<String, Double> treeMap1 = new TreeMap<>();
        
        // Khai bao treeMap duoc tao thanh tu Map
        Map<Float, Integer> map = new HashMap<>();
        TreeMap<Float, Integer> treeMap2 = new TreeMap<>(map);
    }
}
