import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri cho a , b :");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println(" a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a * b = "+(a*b));
        System.out.println("a / b = "+(a/b));
        System.out.println("Phep chia du cua a va b = "+(a%b));
        if(a > b) System.out.println("a > b");
        else System.out.println("a < b");
        if(a == b) System.out.println("a = b");
        else System.out.println("a khac b");
    }
}
