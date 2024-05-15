package Chuong4;
import java.util.LinkedList;
import java.util.Scanner;

public class Slide41Chuong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai bao linkedList kieu String 
        // luu tru cac thang trong nam 
        LinkedList<String> montlyLinkedList = new LinkedList<>();

        for(int i = 1; i <= 12; i++) {
            montlyLinkedList.add("Thang " + i);
        }
        
        System.out.print("Nhap chi so phan tu can lay : ");
        int index = sc.nextInt();
        
        if(index < 0 && index > (montlyLinkedList.size() - 1)) {
            System.out.println("Chi so can lay phai >= 0 va < " + (montlyLinkedList.size() - 1));
        } else {
            String indexNode = montlyLinkedList.get(index);
            System.out.println("Phan tu co chi so = " + index + " trong linkedList la : " + indexNode);
        }

        System.out.println("Phan tu dau tien trong danh sach la : " + montlyLinkedList.getFirst() + " va phan tu cuoi cung trong danh sach la : " + montlyLinkedList.getLast());
    }
}
