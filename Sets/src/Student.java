import java.util.HashSet;
import java.util.Scanner;

public class Student {
    // Thuoc tinh
    private String fullName;
    private int age;
    private HashSet<String> thongTinKhac;

    // Phuong thuc 
    public Student() {
        fullName = "";
        age = 0;
        thongTinKhac = new HashSet<>();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HashSet<String> getThongTinKhac() {
        return thongTinKhac;
    }

    public void setThongTinKhac(HashSet<String> thongTinKhac) {
        this.thongTinKhac = thongTinKhac;
    }

    public static void ThemSinhVien(HashSet<Student> hashSet, int soLuong) {
        for (int i = 0; i < soLuong; i++) {
            Student newStudent = new Student();
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
            newStudent.NhapThongTin();
            hashSet.add(newStudent);
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

    public void HienThiThongTin() {
        System.out.println("Ten : " + fullName);
        System.out.println("Tuoi : " + age);
        for (var x : thongTinKhac) {
            System.out.println(x);
        }
    }

    public static void Display(HashSet<Student> hashSet) {
        for (var x : hashSet) {
            System.out.println();
            x.HienThiThongTin();
            System.out.println();
        }
    }

    public void ThemThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thong tin can them : ");
        String themThongTin = sc.next();
        thongTinKhac.add(themThongTin);
    }

    public static void SuaThongTin(HashSet<Student> hashSet) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien ban can sua : ");
        String name = sc.next();
        Student foundStudent = null;
        for (var x : hashSet) {
            if (x.getFullName().equals(name)) {
                foundStudent = x;
                break;
            }
        }
        if (foundStudent != null) {
            hashSet.remove(foundStudent);
            foundStudent.NhapThongTin();
            hashSet.add(foundStudent);
        } else {
            System.out.println("Khong tim thay sinh vien voi ten: " + name);
        }
    }

    public static void XoaThongTin(HashSet<Student> hashSet) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien ban can xoa : ");
        String name = sc.next();
        Student foundStudent = null;
        for (var x : hashSet) {
            if (x.getFullName().equals(name)) {
                foundStudent = x;
                break;
            }
        }
        if (foundStudent != null) {
            hashSet.remove(foundStudent);
        } else {
            System.out.println("Khong tim thay sinh vien voi ten: " + name);
        }
    }
}
