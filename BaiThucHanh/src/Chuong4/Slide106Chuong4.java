package Chuong4;

import java.util.Set;
import java.util.Map;
import java.util.TreeMap;

public class Slide106Chuong4 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMapPerson = new TreeMap<>();

        treeMapPerson.put(1, "Nguyen Van A");
        treeMapPerson.put(2, "Tran Thi B");
        treeMapPerson.put(3, "Le Thi C");
        treeMapPerson.put(4, "Hoang Van D");

        System.out.println("Danh sach cac nhan vien: ");
        Set<Map.Entry<Integer, String>> setPerson = treeMapPerson.entrySet();
        System.out.println(setPerson);
    }
}