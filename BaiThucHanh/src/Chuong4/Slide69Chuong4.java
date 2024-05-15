package Chuong4;

import java.util.Scanner;
import java.util.TreeSet;

public class Slide69Chuong4 {
    public static void main(String[] args) {
        String hangXe;
        Scanner sc = new Scanner(System.in);
        TreeSet<String> treeSetStr = new TreeSet<>();

        treeSetStr.add("Honda");
        treeSetStr.add("Toyota");
        treeSetStr.add("Vinfast");
        treeSetStr.add("Lamborghitni");
        
        System.out.println("Cac loai xe trong treeSetStr: ");
        System.out.println(treeSetStr);
        System.out.println("Nhap phan tu can them: ");
        hangXe = sc.nextLine();

        if(!treeSetStr.contains(hangXe)) {
            treeSetStr.add(hangXe);
            System.out.println("Them thanh cong!");
            System.out.println("Cac loai xe trong treeSetStr sau khi them: ");
            System.out.println(treeSetStr);
        } else {
            System.out.println("Xe " + hangXe + " da ton tai!");
        }
    }
    
}