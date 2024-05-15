package Chuong4;
import java.util.ArrayList;

public class Slide22Chuong4 {
    public static void main(String[] args) {
        // Viet chuong trinh thu mot so phuong thuc cua arrayList
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Pink");
        arrayList.remove("Pink");
        arrayList.add("Yellow");

        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("Red"));
        System.out.println(arrayList);
    }
}
