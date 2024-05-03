package people;

public class EmployeePartTime extends Employee{
    // Fields
    public int hourOfWork;

    // Methods
    public EmployeePartTime() {
        position = "Part time";
        hourOfWork = 0;
    }
    public void inputInformation() {
        super.inputInformation();
        System.out.print("Nhap so gio lam viec : ");
        hourOfWork = sc.nextInt();
    }
    public void caculatedSalary() {
        salary *= hourOfWork;
    }
    public void outputInformation() {
        super.outputInformation();
    }
}