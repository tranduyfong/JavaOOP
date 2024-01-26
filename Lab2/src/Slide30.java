import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Nhap n
        System.out.print("Nhap so nguyen duong n : ");
        int n = input.nextInt();
        int sumOfNumbers = 0;
        int soDu;
        while (n > 0) {
            soDu = n % 10;
            n /= 10;
            sumOfNumbers += soDu;
        }
        System.out.println("Tong cac chu so la : "+sumOfNumbers);
    }
}
