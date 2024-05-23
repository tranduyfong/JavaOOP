import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Student> hashSetStudents = new HashSet<>();
        System.out.print("Nhap so luong sinh vien : ");
        int soLuong = sc.nextInt();
        Student.ThemSinhVien(hashSetStudents, soLuong);
        System.out.println();
        Student.SuaThongTin(hashSetStudents);
        System.out.println();
        Student.XoaThongTin(hashSetStudents);
        Student.Display(hashSetStudents);
    }
    
}