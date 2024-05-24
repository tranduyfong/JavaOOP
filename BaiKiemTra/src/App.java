import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        TDP143Person ps = new TDP143PersonTrienKhai();
        LinkedList<TDP143Person> linkedListStudent = new LinkedList<>();
        ps.NhapThongTin();
        ps.SuaThongTin();
        ps.HienThi();
        ps.XoaThongTin();
    }
}
