package Static;

public class TestToaDo {
    public static void main(String[] args) {
        ToaDo toaDo1 = new ToaDo();
        toaDo1.x = 10;
        toaDo1.y = 20;

        ToaDo toaDo2 = new ToaDo();
        toaDo2.x = 5;
        toaDo2.y = 6;

        ToaDo.thongTin = "Luu toa do cac hinh hoc";
    }
}
