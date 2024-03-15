public class TestEmployee {
    public static void main(String[] args) {
        Employee staff1 = new Employee();
        staff1.inputInformation();
        staff1.caculatedSalary(staff1.yearForWork);
        staff1.outputInformation();
    }
}
