import java.util.Scanner;
//74    81  90  95  96  97
public class Slide74 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Nhap so phan tu cua mang : " );
        int number = inputScanner.nextInt();

        int sumOfNumbers = 0;
        int[] array = new int[number];

        for( int i = 0; i < number ; i ++ ) {
            System.out.print("Nhap phan tu thu "+(i+1)+" : ");
            array[i] = inputScanner.nextInt();
        }

        for( int i = 0 ; i<number ; i ++ ) {
            if(array[i] % 2 == 0 ) {
                sumOfNumbers += array[i];
            }
        }

        System.out.print("Gia tri tong cua cac phan tu chan cua mang la : "+sumOfNumbers);
    }
}
