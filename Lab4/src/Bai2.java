import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        double count = 0;
        int sum = 0;
        System.out.print("Nhap so luong phan tu : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri phan tu thu " + (i + 1) + " : ");
            linkedList.add(sc.nextInt());
        }
        for(int x : linkedList) {
            if(x % 2 == 0) {
                sum += x;
                ++ count;
            }
        }
        System.out.printf("AVG = " + (double)(sum / count));
    }
}
