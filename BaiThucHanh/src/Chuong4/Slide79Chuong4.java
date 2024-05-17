package Chuong4;

import java.util.HashMap;
import java.util.TreeMap;

public class Slide79Chuong4 {
    public static void main(String[] args) {
        // Khai bao mot HashMap voi cap tuyen tinh la Integer va Float
        HashMap<Integer, Float> hashMap1 = new HashMap<>();

        // Khai bao mot hashMap voi cap key and value la String
        // co kich thuoc khoi tao la 10
        HashMap<String, String> hashMap2 = new HashMap<>();

        // Khai bao mot Hash Map voi kich thuoc khoi tao = 4
        // yeu to tai = 0.75f (mac dinh)
        HashMap<Double, Double> hashMap3 = new HashMap<>(4, 0.75f);

        // Khai bao mot HashMap duoc tao thanh tu mot collection khac 
        HashMap<Integer, String> hashMap4 = new HashMap<>( new TreeMap<>());
    }
}
