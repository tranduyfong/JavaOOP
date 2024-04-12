package GetterSetter;

public class MainClass {
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien();
        SinhVien sinhVien2 = new SinhVien();

        sinhVien1.setTen("");
        sinhVien1.setTuoi(23);

        sinhVien2.setTen("Phong");
        sinhVien2.setTuoi(19);

        System.out.println("Studen 1 : " + sinhVien1.getTen() + " Age : " + sinhVien1.getTuoi());
        System.out.println("Student 2 : " + sinhVien2.getTen() + "Age : " + sinhVien2.getTuoi());
    }
}
