import java.util.ArrayList;

public class Slide18Chuong4 {
    public static void main(String[] args) {
        // Duyet ArrayList voi ForEach
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Them du lieu
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(8);

        // Duyet arrayList
        System.out.print("Cac phan tu co trong arrayList la : ");
        for(int x : arrayList) {
            System.out.print(x + " ");
        }
    }
}
