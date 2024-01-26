import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        String reString = "" ;
        //Vong lap
        while(sum <= 100) {
            System.out.print("Nhap gia tri : ");
            int n = input.nextInt();
            sum+=n;
            reString = reString + n + " + ";
        }
        System.out.println(reString.substring(0,reString.length()-2)+ "= "+sum);
    }
}