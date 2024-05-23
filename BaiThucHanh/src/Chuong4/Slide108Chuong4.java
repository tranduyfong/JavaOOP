package Chuong4;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Slide108Chuong4 {
    public static void main(String[] args) {
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
         
        treeMap.put(101, 5d);
        treeMap.put(102, 43.5d);
        treeMap.put(103, 12.3d);
        treeMap.put(104, 75.12d);

        Set<Map.Entry<Integer, Double>> settreeMap = treeMap.entrySet();
        System.out.println("Danh sach cac entry co trong treeMap: ");
        System.out.println(settreeMap);
        
        //Thay the value co khoa la 103
        treeMap.replace(103, 43.87d);

        //Thay the entry co key bang 101, value 5d thanh 23d
        treeMap.replace(101,  5d, 23d);

        System.out.println("Danh sach sau khi thay doi: ");
        settreeMap = treeMap.entrySet();
        System.out.println(settreeMap);
    }    
}