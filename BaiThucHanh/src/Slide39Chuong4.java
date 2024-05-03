import java.util.LinkedList;

public class Slide39Chuong4 {
    public static void showList(LinkedList<String> someList) {
        for(String x : someList) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Khai bao linkedList kieu String
        LinkedList<String> linkedList = new LinkedList<>();

        // Them gia tri
        linkedList.add("Java");
        linkedList.add("C++");
        linkedList.add("PHP");
        linkedList.add("Java");

        linkedList.add(0, "Head");
        linkedList.add(linkedList.size() - 1, "Last");

        // Mot so phuong thuc 1
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.addAll(linkedList);
        // linkedList2.addAll(2, linkedList1); // Them vao gia tri tu vi tri index thu 2
        System.out.println("Day la du lieu cua linkedList 1 : ");
        showList(linkedList);
        System.out.println();
        System.out.println("Day la du lieu linkedList 2 : ");
        showList(linkedList2);
        System.out.println();

        // Mot so phuong thuc 2
        linkedList.addFirst("000");
        linkedList.addLast("999");
        
        // Vi du phuong thuc retainAll()
        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("Java");
        // Xoa nhung phan tu khong thuoc list3 khoi list1
        linkedList.retainAll(linkedList3);
        System.out.println("LinkedList 1 : ");
        showList(linkedList);
        System.out.println();

        // Phuong thuc RemoveAll()
        // Xoa nhung phan tu thuoc list3 khoi list1
        linkedList.removeAll(linkedList3);
        System.out.println("Nhung phan tu cua linkedList 1 : ");
        showList(linkedList);
    }
}
