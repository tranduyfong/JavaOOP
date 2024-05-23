import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arrayListStudents = new ArrayList<>();

        System.out.print("Nhap so luong sinh vien : ");
        int soLuong = sc.nextInt();
        Student.ThemSinhVien(arrayListStudents, soLuong);
        Student.SuaThongTin(arrayListStudents);
        Student.XoaThongTin(arrayListStudents);
        Student.Display(arrayListStudents);
    }
}