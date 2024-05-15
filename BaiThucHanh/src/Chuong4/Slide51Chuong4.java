package Chuong4;
import java.util.HashSet;
import java.util.TreeSet;

public class Slide51Chuong4 {
    public static void main(String[] args) {
        // Khai bao mot HashSet co kieu Integer
        HashSet<Integer> hashSetInteger = new HashSet<>();

        // Khai bao mot hashSet co kich thuoc 32
        HashSet<Integer> hashSetInteger2 = new HashSet<>(32);

        //Khai bao mot HashSet co kich thuoc khoi tao = 16 va yeu to tai = 0.75f
        HashSet<Character> hashSetCharacters = new HashSet<>(16, 0.75f);

        // Khai bao mot hashSet duoc tao thanh tu mot collection khac 
        HashSet<Float> hashSetFloats = new HashSet<>(new TreeSet<>());
    }
}
