package Chuong4;
import java.util.ArrayList;

public class Slide17Chuong4 {
    public static void main(String[] args) {
        // Duyet ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Them du lieu vao arrayList
        arrayList.add("PHP");
        arrayList.add("Java");
        arrayList.add("C#");
        arrayList.add("C++");

        // Duyet theo kich thuoc
        // CU PHAP : arrayList.size()
        System.out.print("Cac phan tu co trong arrayList la : ");
        for(int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
