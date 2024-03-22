package shapes;

public class HinhTron extends HinhHoc {
    // Fields
    public float banKinh;

    // Methods
    public HinhTron() {
        ten = "Hinh tron";
        banKinh = 0;
    }
    public void nhapBanKinh() {
        System.out.print("Nhap ban kinh cho hinh : ");
        banKinh = sc.nextFloat();
    }
    public void tinhChuVi() {
        chuVi = banKinh * 2 * PI;
    }
    public void tinhDienTich() {
        dienTich = banKinh * banKinh * PI;
    }
}
