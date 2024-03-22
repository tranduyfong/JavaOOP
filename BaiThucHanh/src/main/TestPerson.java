package main;

import people.EmployeeFullTime;
import people.EmployeePartTime;

public class TestPerson {
    public static void main(String[] args) {
        EmployeePartTime staff = new EmployeePartTime();
        staff.inputInformation();
        staff.caculatedSalary();

        EmployeeFullTime staff2 = new EmployeeFullTime();
        staff2.inputInformation();
        staff2.caculatedSalary(staff2.yearOfExperence);

        staff2.outputPosition();
        staff2.outputInformation();
        System.out.println();
        staff.outputPosition();
        staff.outputInformation();
    }
}
