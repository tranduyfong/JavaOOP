package Chuong3;
import java.util.Scanner;

public class Circle {
    Scanner sc = new Scanner(System.in);
    public int banKinh;
    public double dienTich;
    public double chuVi;

    public void nhapThongTin() {
        System.out.print("Nhap ban kinh cua hinh tron : ");
        banKinh = sc.nextInt();
    }
    public void tinhDienTich() {
        dienTich = banKinh * banKinh * Math.PI * 1d;
    }
    public void tinhChuVi() {
        chuVi = banKinh * 2 * Math.PI * 1d;
    }
    public void inDienTich() {
        System.out.printf("Dien tich cua hinh tron la : %.3f ",dienTich);
        System.out.println();
    }
    public void inChuVi() {
        System.out.printf("Chu vi cua hinh tron la : %.3f ", chuVi);
        System.out.println();
    }
}