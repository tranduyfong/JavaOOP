package shapes;
public class HinhChuNhat extends HinhHoc {
    // Fields
    public float dai;
    public float rong;

    // Methods
    public HinhChuNhat() {
        ten = "Hinh chu nhat";
        dai = 0;
        rong = 0;
    }
    public void nhapChieuDai() {
        System.out.print("Nhap chieu dai : ");
        dai = sc.nextFloat();
    }
    public void nhapChieuRong() {
        System.out.print("Nhap chieu rong : ");
        rong = sc.nextFloat();
    }
    public void tinhChuVi() {
        chuVi = dai * 2 + rong * 2;
    }
    public void tinhDienTich() {
        dienTich = dai * rong;
    }

}

