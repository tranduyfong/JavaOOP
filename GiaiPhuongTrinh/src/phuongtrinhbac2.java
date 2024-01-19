import java.util.Scanner;
import java.lang.Math;
public class phuongtrinhbac2 {
    public static void main(String[] args) {
        //Phuong trinh bac 2 ax^2+bx+c=0
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("Nhap gia tri cho a : ");
        a = sc.nextDouble();
        System.out.print("Nhap gia tri cho b : ");
        b = sc.nextDouble();
        System.out.print("Nhap gia tri cho c : ");
        c = sc.nextDouble();
        double denta = b*b - 4*a*c;
        if(a == 0) {
            if(b==0) {
                if(c==0) {
                    System.out.println("Do a,b,c=0 nen phuong trinh co dang 0=0(luon dung)");
                }
                else System.out.println("Do a=0,b=0 ma c != 0 nen phuong trinh co dang : "+c+" = 0 (vo ly)");
            }
            else System.out.println("Nghiem cua phuong trinh la : x = "+(-c/b));
        }
        else {
            if(denta > 0){
                System.out.println("Phuong trinh co hai nghiem ");
                System.out.printf("Phuong trinh co hai nghiem x1 = %.3f va x2 = %.3f ",((-b+Math.sqrt(denta))/(2*a)),((-b-Math.sqrt(denta))/(2*a)));
            }
            else if(denta == 0) {
                System.out.println("Phuong trinh co nghiem kep");
                System.out.println("Nghiem cua phuong trinh la : x1 = x2 = "+(-b/(2*a)));
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}