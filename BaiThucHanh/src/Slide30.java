import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, soDu, sumOfNumbers = 0;
        //Nhap n
        do {
            System.out.print("Nhap so nguyen duong n : ");
            n = input.nextInt();
        } while(n <= 0);
        while (n > 0) {
            soDu = n % 10;
            n /= 10;
            sumOfNumbers += soDu;
        }
        System.out.println("Tong cac chu so la : "+sumOfNumbers);
    }
}
