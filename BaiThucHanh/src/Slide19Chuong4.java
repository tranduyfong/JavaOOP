import java.util.ArrayList;
import java.util.Iterator;

public class Slide19Chuong4 {
    public static void main(String[] args) {
        ArrayList<Float> arrayList = new ArrayList<>();
        
        arrayList.add(0.2f);
        arrayList.add(0.4f);
        arrayList.add(8.3f);

        // Khai bao mot Iterator co kieu la Float
        Iterator<Float> iterator = arrayList.iterator();
        System.out.print("Cac phan tu co trong arrayList la : ");
        
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
