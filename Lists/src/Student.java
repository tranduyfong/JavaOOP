import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String fullName;
    private int age;
    private ArrayList<String> thongTinKhac;

    public String getFullName() {
        return fullName;
    }
    public int getAge() {
        return age;
    }
    public ArrayList<String> getThongTinKhac() {
        return thongTinKhac;
    }

    public Student() {
        fullName = "";
        age = 0;
        thongTinKhac = new ArrayList<>();
    }
    public static void ThemSinhVien(List<Student> arrayList, int soLuong) {
        for(int i = 0; i < soLuong; i++) {
            Student newStudent = new Student();
            System.out.println("Nhap thong tin cua sinh vien thu " + (i + 1));
            newStudent.NhapThongTin();
            arrayList.add(newStudent);
        }
    }
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten : ");
        fullName = sc.next();
        System.out.print("Nhap tuoi : ");
        age = sc.nextInt();
        ThemThongTin();
    }

    public void ThemThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thong tin can them : ");
        String themThongTin = sc.next();
        thongTinKhac.add(themThongTin);
    }
    
    public static void Display(List<Student> arrayList) {
        for(var x : arrayList) {
            System.out.println();
            x.HienThiThongTin();
            System.out.println();
        }
    }

    public void HienThiThongTin() {
        System.out.println("Ho ten : " + getFullName());
        System.out.println("Tuoi : " + getAge());
        for(var x : thongTinKhac) {
            System.out.println(x);
        }
    }

    public static void SuaThongTin(List<Student> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien can sua : ");
        String name = sc.next();
        for(int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getFullName().equals(name)) {
                Student newStudent = new Student();
                newStudent.NhapThongTin();
                arrayList.set(i, newStudent);
            }
        }
    }

    public static void XoaThongTin(List<Student> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien can xoa : ");
        String name = sc.next();
        for(int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getFullName().equals(name)) {
                arrayList.remove(i);
            }
        }
    }
}