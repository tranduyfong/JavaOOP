import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        System.out.print("Nhap so phan tu : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri phan tu thu " + (i + 1) + " : ");
            int value = sc.nextInt();
            arrayList.add(value);
        }

        System.out.println("Gia tri lon nhat cua mang la : " + maxValues(arrayList));
        removeValues(arrayList);
        System.out.println("Danh sach phan tu sau khi xoa : ");
        showList(arrayList);
        System.out.println("Cac phan tu sau khi sap xep : ");
        showList(sortList(arrayList));
    }
    
    private static void showList(ArrayList<Integer> arrayList) {
        for(int x : arrayList) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    private static int maxValues(ArrayList<Integer> arrayList) {
        int max = arrayList.get(0);
        for(int x : arrayList) {
            if(x > max) {
                max = x;
            }
        }
        return max;
    }

    private static void removeValues(ArrayList<Integer> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan tu can xoa : ");
        int values = sc.nextInt();

        if(arrayList.contains(values)) {
            for(int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i) == values) {
                    arrayList.remove(i);
                }
            }
            System.out.println("Xoa du lieu thanh cong !");
            System.out.println();
        } else {
            System.out.println("khong ton tai gia tri do ...");
        }
    }

    private static ArrayList<Integer> sortList(ArrayList<Integer> arrayList) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        // for(int i = 0; i < arrayList.size() - 1; i++) {
        //     for(int j = i + 1; j < arrayList.size(); j ++) {
        //         if(arrayList.get(j) < arrayList.get(i)) {
        //             int tmp = arrayList.get(i);
        //             arrayList.set(i, arrayList.get(j));
        //             arrayList.set(j, tmp);
        //         }
        //     } 
        // }
        arrayList.sort((o1, o2) -> (o1 - o2));
        newArrayList = arrayList;
        return newArrayList;
    }
}
