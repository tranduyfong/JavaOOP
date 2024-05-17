package Chuong4;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.RowFilter.Entry;;

public class Slide87Chuong5 {
    public static void main(String[] args) {
        // Khai bao Hash Map voi key va value la String
        HashMap<String, String> hashMap = new HashMap<>();

        // Them value vao trong voi key tuong ung
        hashMap.put("CSDL", "Co So Du Lieu");
        hashMap.put("CTDLvGT", "Cau truc du lieu va giai thuat");
        hashMap.put("C#", "C Sharp");

        // Tao mot set  chua toan bo Entry cua HashMap (Entry vua la key vua la Value)
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();

        System.out.println("Cac entry co trong setHashMap : ");
        System.out.println(setHashMap);
    }
}
