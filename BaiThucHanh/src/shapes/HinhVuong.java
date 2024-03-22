package shapes;

public class HinhVuong extends HinhChuNhat{
    // Fields 
        //... Nothing in here

    // Methods 
    public HinhVuong() {
        ten = "Hinh vuong";
        dai = rong;
    }
    public void nhapCanh() {
        System.out.print("Nhap chieu dai canh : ");
        dai = rong = sc.nextFloat();
    }
}
