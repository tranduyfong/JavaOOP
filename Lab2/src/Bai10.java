import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Khoi tao gia tri
        String chuoiKiTu;
        char kiTu;
        int countText = 0;

        do {
            System.out.print("Nhap chuoi ki tu : ");
            chuoiKiTu = input.nextLine();
        } while( chuoiKiTu.length() > 80 );

        System.out.print("Nhap ki tu ma ban can do tim : ");
        kiTu = input.next().charAt(0);

        //Vong lap do tim kiem tra
        for(int i = 0 ; i < chuoiKiTu.length() ; i++) {
            if(chuoiKiTu.charAt(i) == kiTu ) {
                ++countText;
            }
        }
        System.out.println("So lan xuat hien chu cai "+kiTu+" la : "+countText);
    }
}
