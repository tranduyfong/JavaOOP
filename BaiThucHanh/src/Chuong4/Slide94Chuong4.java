package Chuong4;

import java.util.LinkedHashMap;

public class Slide94Chuong4 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(100, "Mo");
        linkedHashMap.put(101, "Dia");
        linkedHashMap.put(102, "Chat");

        System.out.println("Before delete : " + linkedHashMap);
        for(var m : linkedHashMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        linkedHashMap.remove(100);
        System.out.println("After delete : " + linkedHashMap);
        for(var m : linkedHashMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
