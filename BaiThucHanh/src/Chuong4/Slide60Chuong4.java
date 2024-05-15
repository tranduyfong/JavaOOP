package Chuong4;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Slide60Chuong4 {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("JAVA");
        linkedHashSet.add("C++");
        linkedHashSet.add("C#");
        linkedHashSet.add("HTML");

        System.out.println("Cac phan tu trong linkedHashSet: ");
        System.out.println(linkedHashSet);
        System.out.println("Phan tu can xoa: ");
        a = sc.nextLine();

        if(linkedHashSet.contains(a)) {
            linkedHashSet.remove(a);
            System.out.println("Cac phan tu trong linkedHashSet sau khi xoa la: ");
            System.out.println(linkedHashSet);
        } else {
            System.out.println("Phan tu " + a + " khong ton tai! ");
        }
    }
    
}