// Tạo class Employee, có các phương thức Nhập Thông tin, Xuất Thông tin, Tính lương nhân viên. Sau đó tạo đối tượng từ class Student và chạy thực thi.

import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);
    // Fields
    public String idStaff;
    public String fullNameStaff;
    public String staffOffice;
    public int yearForWork;
    public float salary = 1000;

    // Methods
    public void inputInformation() {
        System.out.print("Nhap ID nhan vien : ");
        idStaff = sc.nextLine();
        System.out.print("Nhap ten nhan vien : ");
        fullNameStaff = sc.nextLine();
        System.out.print("Nhap vi tri nhan vien : ");
        staffOffice = sc.nextLine();
        System.out.print("Nhap so nam nhan vien da gan bo : ");
        yearForWork = sc.nextInt();
    }
    public void caculatedSalary(int yearForWork) {
        if(yearForWork < 2) {
            salary += 100;
        } else if(yearForWork < 5) {
            salary += 200;
        } else if(yearForWork < 10) {
            salary += 300;
        } else {
            salary += 500;
        }
    }
    public void outputInformation() {
        System.out.println("ID : " + idStaff);
        System.out.println("Name : " +fullNameStaff);
        System.out.println("Office : " + staffOffice);
        System.out.println("Salary : " + salary + "$");
    }
}
