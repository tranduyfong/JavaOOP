import java.util.Scanner;

public class phuongtrinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Phuong trinh bac 1 ax+b=0
        double a, b;
        System.out.print("Nhap gia tri cho a : ");
        a = sc.nextDouble();
        System.out.print("Nhap gia tri cho b : ");
        b = sc.nextDouble();
        System.out.print("Phuong trinh co dang la "+a+"x"+" + "+b+" = 0");
        System.out.println();
        if(a == 0) {
        if(b == 0) System.out.println("Phuong trinh co dang 0 = 0 (luon dung)");
        else System.out.println("Phuong trinh khong ton tai do a phai khac 0 ");
        }
        else System.out.println("Phuong trinh cua nghiem la x = "+(-b/a));
    }
}