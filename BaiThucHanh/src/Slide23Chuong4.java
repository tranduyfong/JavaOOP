import java.util.ArrayList;
import java.util.Scanner;

public class Slide23Chuong4 {
    public static void main(String[] args) {
        // Khai bao thu vien
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Khai bao so luong phan tu
        System.out.print("Nhap so luong phan tu : ");
        int numberSize = sc.nextInt();

        // Nhap gia tri cho cac phan tu
        for(int i = 0; i < numberSize; i++) {
            System.out.print("Nhap gia tri cho phan tu thu " + (i + 1) + " : ");
            int dataNumber = sc.nextInt();
            arrayList.add(dataNumber);
        }

        // Khai bao doi tuong lam linh canh va tim phan tu lon nhat
        int maxOfValue = arrayList.get(0);
        for(int x : arrayList) {
            if(x > maxOfValue) {
                maxOfValue = x;
            }
        }
        System.out.println("Phan tu lon nhat trong mang la : " + maxOfValue);
    }
}
