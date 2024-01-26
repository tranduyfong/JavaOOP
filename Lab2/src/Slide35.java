import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Nhap hai so
        System.out.print("Nhap hai so a va b : ");
        double a = input.nextDouble();
        double b = input.nextDouble();

        //Kiemtra
        if(a>b) System.out.println("A > B");
        else if(b>a) System.out.println("B > A");
        else System.out.println("A = B");
    }
}