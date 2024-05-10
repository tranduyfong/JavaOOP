import java.util.HashSet;
import java.util.Scanner;

public class Slide55Chuong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();

        // Add values
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);

        // Show list just added
        System.out.print("List : ");
        for(int x : hashSet) {
            System.out.print(x + " ");
        }

        System.out.print("Nhap phan tu can them : ");
        int number = sc.nextInt();
        if(!hashSet.contains(number)){
            hashSet.add(number);
            System.out.println("Them phan tu thanh cong");
            System.out.println();
        } else {
            System.out.println("Phan tu nay da ton tai !");
        }
    }
}
