package shapes;
public class HinhTru extends HinhTron {
    // Fields
    public float chieuCao;

    // Methods
    public HinhTru() {
        ten = "Hinh tru";
        chieuCao = 0;
    }
    public void nhapChieuCao() {
        super.nhapBanKinh();
        System.out.print("Nhap chieu cao : ");
        chieuCao = sc.nextFloat();
    }
    public void tinhTheTich() {
        theTich = banKinh * banKinh * PI * chieuCao;
    }

}

