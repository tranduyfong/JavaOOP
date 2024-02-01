import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Nhap mang va phan tu cua mang
        System.out.print("Nhap so phan tu cua mang A : ");
        int soPhanTu = input.nextInt();
        int[] phantuMang = new int[soPhanTu];
        for(int i = 0;i < phantuMang.length;i++) {
            System.out.print("Nhap phan tu thu "+(i+1)+" cua mang : ");
            phantuMang[i] = input.nextInt();
        }
        System.out.println();

        //In ra man hinh truoc khi sap xep
        System.out.print("Mang truoc khi sap xep la : ");
        for(int i = 0;i < phantuMang.length; i++) {
            System.out.print(phantuMang[i] + " ");
        }
        System.out.println();

        //Sap xep mang tang dan
        for(int i = 0;i<phantuMang.length;i++) {
            for(int j = i + 1 ; j < phantuMang.length;j++) {
                if(phantuMang[i] > phantuMang[j]) {
                    int temp = phantuMang[i];
                    phantuMang[i] = phantuMang[j];
                    phantuMang[j] = temp;
                }
            }
        }

        //in chuoi sau khi sap xep
        System.out.print("Mang sau khi sap xep tang dan la : ");
        for(int i = 0;i < phantuMang.length;i++) {
            System.out.print(phantuMang[i] + " ");
        }
    }
}
