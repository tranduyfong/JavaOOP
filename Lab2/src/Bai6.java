import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,answer = 1; // Khoi tao gia tri

        do { 
            System.out.print("Nhap gia tri cho n : ");
            n = input.nextInt();
        } while(n < 0);

        System.out.print("Gia tri cua "+n+"! = ");
        do {
            if(n == 0 ) continue;
            else {
                answer = answer * n;
                n --;
            }
            } while (n > 0);
        System.out.println(answer);
    }
}
