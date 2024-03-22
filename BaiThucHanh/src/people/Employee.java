package people;

public class Employee extends Person {
    // Fields
    public String position;
    public double salary = 20000;
    public String idEmployee;

    // Methods
    public Employee() {
        idEmployee = "";
        position = "";
    }
    public void outputPosition() {
        System.out.println("Vi tri : " + position);
    }
    public void inputInformation() {
        super.inputInformation();
        System.out.print("Nhap ma nhan vien : ");
        idEmployee = sc.next();
    }
    public void outputInformation() {
        super.outputInformation();
        System.out.println("Id : " + idEmployee);
        System.out.println("Salary : " + salary + "VND");
    }
}
