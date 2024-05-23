import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien : ");
        int soLuong = sc.nextInt();
        LinkedList<Student> linkedListStudents = new LinkedList<>();

        while (true) {
            System.out.println();
            System.out.println("1. Them sinh vien.");
            System.out.println("2. Sua thong tin sinh vien.");
            System.out.println("3. Xoa thong tin sinh vien.");
            System.out.println("4. Hien thi thong tin sinh vien.");
            System.out.println("0. Thoat");
            System.out.println();
            System.out.print("Nhap lua chon : ");
            int luaChon = sc.nextInt();
            System.out.println();

            if(luaChon == 0) {
                break;
            } else {
                switch (luaChon) {
                    case 1:
                        Student newStudent = new Student();
                        newStudent.inputInfomartion();
                        linkedListStudents.add(newStudent);
                        break;
                    case 2:
                        String findName;
                        System.out.print("Lua chon sinh vien can chinh sua : ");
                        findName = sc.next();
                        System.out.println();
                        for(var x : linkedListStudents) {
                            if(x.fullName.equals(findName)) {
                                x.updateInformation();
                            }
                        }
                        System.out.println();
                        break;
                    case 3:
                        String findStudent;
                        System.out.print("Nhap ten sinh vien can xoa : ");
                        findStudent = sc.next();
                        System.out.println();
                        boolean foundStudent = false;
                        for(int i = 0; i < linkedListStudents.size(); i++) {
                            if(linkedListStudents.get(i).fullName.equals(findStudent)) {
                                foundStudent = true;
                                linkedListStudents.remove(i);
                                System.out.println("Xoa thanh cong !");
                                System.out.println();
                                break;
                            }
                        }
                        if(!foundStudent) {
                            System.out.println("Khong ton tai sinh vien do !");
                        }
                        break;
                    case 4:
                        String findStudent2;
                        System.out.print("Lua chon sinh vien can hien thi : ");
                        findStudent2 = sc.next();
                        boolean showStudent = false;
                        for(int i = 0; i < linkedListStudents.size(); i++) {
                            if(linkedListStudents.get(i).fullName.equals(findStudent2)) {
                                showStudent = true;
                                linkedListStudents.get(i).outputInformation();
                                System.out.println();
                                break;
                            }
                        }
                        if(!showStudent) {
                            System.out.println("Khong ton tai sinh vien nay !");
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }
}