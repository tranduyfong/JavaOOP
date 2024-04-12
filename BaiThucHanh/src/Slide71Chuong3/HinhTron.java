package Slide71Chuong3;

public class HinhTron {
    private final float PI = 3.14f;
    private float banKinh;

    public float getBanKinh() {
        return banKinh;
    }
    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }
    public float tinhChuVi() {
        return banKinh * PI * 2;
    }
    public float tinhDienTich() {
        return banKinh * banKinh * PI;
    }
}
