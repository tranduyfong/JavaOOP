package GetterSetter;

public class Main {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.setBanKinh(10.3f);
        System.out.println("Chu vi : " + ht.tinhChuVi() + " - Dien tich : " + ht.tinhDienTich());
    }
}
