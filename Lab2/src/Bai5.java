import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        //Vong lap
        while(sum < 100) {
            System.out.print("Nhap gia tri : ");
            int n = input.nextInt();
            sum+=n;
            System.out.println("Gia tri tong hien tai la : "+sum);
        }
        System.out.println("Gia tri sau khi ra ngoai vong lap la : "+sum);
    }
}