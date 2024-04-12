package Slide80Chuong3;

public class TestSlide80 {
    public static void main(String[] args) {
        // Tao 4 doi tuong nhan vien
        NhanVienFullTime sep = new NhanVienFullTime("Hoang Van Sep", 4);
        NhanVienFullTime nhanvien = new NhanVienFullTime("Tran Thi Nhan Vien"); // Nhan vien khong lam them ngay nao
        NhanVienFullTime nhanvien2 = new NhanVienFullTime("Nguyen Thi Vien Nhan", 2); // Nhan vien lam them ngay
        NhanVienPartTime nhanvien3 = new NhanVienPartTime("Nguyen Thi Pat Tham", 150); // Tao doi tuong nhan vien part time

        // Set chuc vu cho nhan vien
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        nhanvien.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        nhanvien2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        
        // Tinh luong
        sep.tinhLuong();
        nhanvien.tinhLuong();
        nhanvien2.tinhLuong();
        nhanvien3.tinhLuong();

        // Output
        sep.xuatThongTin();
        nhanvien.xuatThongTin();
        nhanvien2.xuatThongTin();
        nhanvien3.xuatThongTin();
    }
}
