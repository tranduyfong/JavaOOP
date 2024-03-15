import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);
    public String FullName;
    public String Gender;
    public String Address;
    public String ClassId;

    public int Age;
    public int Heigh;
    public int Weigh;

    public void inputInformation() {
        System.out.print("Nhap ten : ");
        FullName = sc.nextLine();
        System.out.print("Nhap tuoi : ");
        Age = sc.nextInt();
        System.out.print("Nhap gioi tinh : ");
        Gender = sc.nextLine();
        System.out.print("Nhap dia chi : ");
        Address = sc.nextLine();
        System.out.print("Nhap ten lop : ");
        ClassId = sc.nextLine();
        System.out.print("Nhap can nang : ");
        Weigh = sc.nextInt();
        System.out.print("Nhap chieu cao : ");
        Heigh = sc.nextInt();
    }
    public void outputInformation() {
        System.out.println("Name : " + FullName);
        System.out.println("Age : " + Age);
        System.out.println("Gender : " + Gender);
        System.out.println("Address : " + Address);
        System.out.println("Name of class : " + ClassId);
        System.out.println("Weigh : " + Weigh);
        System.out.println("Heigh : " + Heigh);
    }

}
