import java.util.Scanner;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> arrayListStudents = new LinkedList<>();

        System.out.print("Nhap so luong sinh vien : ");
        int soLuong = sc.nextInt();
        Student.ThemSinhVien(arrayListStudents, soLuong);
        Student.SuaThongTin(arrayListStudents);
        Student.XoaThongTin(arrayListStudents);
        Student.Display(arrayListStudents);
    }
}