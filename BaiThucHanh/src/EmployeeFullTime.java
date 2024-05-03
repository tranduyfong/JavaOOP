package people;

public class EmployeeFullTime extends Employee {
    // Fields
    public int dayOfWork;
    public int yearOfExperence;

    // Methods
    public EmployeeFullTime() {
        position = "Full time";
        dayOfWork = 0;
        yearOfExperence = 0;
    }
    public void inputInformation() {
        super.inputInformation();
        System.out.print("Nhap so nam kinh nghiem : ");
        yearOfExperence = sc.nextInt();
        System.out.print("Nhap so ngay lam viec : ");
        dayOfWork = sc.nextInt();
    }

    public void caculatedSalary(int yearOfExperence) {
        if(yearOfExperence < 3) {
            salary = salary * dayOfWork + 50000;
        } else if(yearOfExperence < 6) {
            salary = salary * dayOfWork + 100000;
        } else {
            salary = salary * dayOfWork + 200000;
        }
    }
    public void outputInformation() {
        super.outputInformation();
        System.out.println("Year of experence : " + yearOfExperence);
    }
}