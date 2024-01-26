import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Nhap thong tin
        System.out.print("Nhap ten : ");
        String name = input.next();
        System.out.print("Nhap nam sinh : ");
        int yearOfBirth = input.nextInt();
        
        //cau truc re nhanh
        if((2024-yearOfBirth) >= 18) {
            System.out.println("Ban "+name+" da gia");
        }
        else if((2024-yearOfBirth) >= 16) {
            System.out.println("Ban "+name+" o do tuoi truong thanh");
        }
        else {
            System.out.println("Ban "+name+" o do tuoi vi thanh nien");
        }
    }
}
