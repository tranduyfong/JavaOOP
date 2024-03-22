package people;
import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);

    // Fields
    public String fullName;
    public String address;
    public int age;

    // Methods
    public Person() {
        fullName = "";
        address = "";
        age = 0;
    }
    public void inputInformation() {
        System.out.print("Nhap ten : ");
        fullName = sc.nextLine();
        System.out.print("Nhap dia chi : ");
        address = sc.nextLine();
        System.out.print("Nhap tuoi : ");
        age = sc.nextInt();
    }
    public void outputInformation() {
        System.out.println("Name : " + fullName);
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);
    }
    public void outputPosition(String position) {
        System.out.println("Vi tri : " + position);
    }
}
