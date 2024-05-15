package Chuong3.Slide80Chuong3;

public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;

    public NhanVienPartTime(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien Part Time";
    }

    public void tinhLuong() {
        luong = gioLamViec * Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO;
    }
    
}
