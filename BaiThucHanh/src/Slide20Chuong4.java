import java.util.ArrayList;
import java.util.ListIterator;

public class Slide20Chuong4 {
    public static void main(String[] args) {
        ArrayList<Character> arrayList = new ArrayList<>();

        arrayList.add('a');
        arrayList.add('b');
        arrayList.add('c');

        // Khai bao mot ListIterator
        ListIterator<Character> listIterator = arrayList.listIterator();
        System.out.print("Cac phan tu co trong arrayList la : ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
    }
}
