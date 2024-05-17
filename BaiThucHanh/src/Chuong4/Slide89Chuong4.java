package Chuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide89Chuong4 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("QN", "Quang Nam");
        hashMapCity.put("QNg", "Quang Ngai");

        // Them mot key voi gia tri la "QN"
        hashMapCity.put("QN", "Quang Ninh");
        hashMapCity.put("HCM", "Thanh pho Ho Chi Minh");

        System.out.println("Danh sach thanh pho trong Hash Map la : ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);
        // Man hinh se chi in ra QN = Quang Ninh ma khon in ra Quang Nam
        
        System.out.println("QNg : " + hashMapCity.get("QNg"));

        // In ra mot gia tri Key khong ton tai
        System.out.println("NT : " + hashMapCity.get("NT")); // Null

        // Kiem tra xem mot value co ton tai trong Map hay khong
        if (hashMapCity.containsValue("Thanh pho Ho Chi Minh")) {
            System.out.println("Co ten thanh pho HCM trong Map");
        }
    }
}
