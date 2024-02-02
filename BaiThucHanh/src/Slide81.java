import java.util.Scanner;

public class Slide81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Xac dinh mang 2 chieu
        System.out.print("Nhap so phan tu hang ngang cua mang 2 chieu : ");
        int hangNgang = input.nextInt();
        System.out.print("Nhap so phan tu hang doc cua mang 2 chieu : ");
        int hangDoc = input.nextInt();
        
        //Khai bao va nhap gia tri cho mang
        int[][] mangHaiChieu = new int[hangNgang][hangDoc];
        for(int i = 0 ; i < mangHaiChieu.length;i++) {
            for(int j = 0 ;  j < mangHaiChieu[i].length;j++) {
                System.out.print("Nhap gia tri cho phan tu [" + (i+1) + "]" + "[" + (j+1) + "] la : ");
                mangHaiChieu[i][j] = input.nextInt();
            }
        }

        //Khoi tao bien co dinh va tim kiem gia tri lon nhat
        int maxOfValue = mangHaiChieu[0][0];
        for(int i = 0 ;i < mangHaiChieu.length; i++) {
            for(int j = 0;j < mangHaiChieu[i].length; j++) {
                if(mangHaiChieu[i][j] >= maxOfValue) {
                    maxOfValue = mangHaiChieu[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat cua mang la : "+maxOfValue);
    }
}
