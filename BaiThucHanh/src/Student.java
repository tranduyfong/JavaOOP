// - Tạo class Student, có các phương thức Nhập Thông tin, Xuất Thông tin, Tính điểm tổng kết môn học. Sau đó tạo đối tượng từ class Student và chạy thực thi.

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    // Fields
    public String idStudent;
    public String fullName;
    public String subject;
    public double diemA;
    public double diemB;
    public double diemC;
    public double avg;

    // Methods
    public void inputInformation() {
        System.out.print("Nhap ma sinh vien : ");
        idStudent = sc.nextLine();
        System.out.print("Nhap ho ten : ");
        fullName = sc.nextLine();
        System.out.print("Nhap ten mon hoc : ");
        subject = sc.nextLine();
        System.out.print("Nhap diem C : ");
        diemC = sc.nextDouble();
        System.out.print("Nhap diem B : ");
        diemB = sc.nextDouble();
        System.out.print("Nhap diem A : ");
        diemA = sc.nextDouble();
    }
    public void avgGpaSubject() {
        avg = diemA * 0.6 + diemB * 0.3 + diemC * 0.1;
    }
    public void outputInformation() {
        System.out.println("Id : " + idStudent);
        System.out.println("Name : " + fullName);
        System.out.println("Subject : " + subject);
        System.out.printf("GPA : %.1f", avg);
    }
}
