package Lists;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberStudent;
        System.out.print("Nhap so luong sinh vien : ");
        numberStudent = input.nextInt();
        ArrayList<Student> arrayListStudents = new ArrayList<>(numberStudent);

        while (true) {
            System.out.println();
            System.out.println("1. Them sinh vien.");
            System.out.println("2. Sua thong tin sinh vien.");
            System.out.println("3. Xoa thong tin sinh vien.");
            System.out.println("4. Hien thi thong tin sinh vien.");
            System.out.println("0. Thoat");
            System.out.println();
            System.out.print("Nhap lua chon : ");
            int numberSelect = input.nextInt();
            System.out.println();

            if(numberSelect == 0) {
                break;
            } else {
                switch (numberSelect) {
                    case 1:
                        Student newStudent = new Student();
                        newStudent.inputInfomartion();
                        arrayListStudents.add(newStudent);
                        break;
                    case 2:
                        String findName;
                        System.out.print("Lua chon sinh vien can chinh sua : ");
                        findName = input.next();
                        System.out.println();
                        for(var x : arrayListStudents) {
                            if(x.fullName.equals(findName)) {
                                x.updateInformation();
                            }
                        }
                        System.out.println();
                        break;
                    case 3:
                        String findStudent;
                        System.out.print("Nhap ten sinh vien can xoa : ");
                        findStudent = input.next();
                        System.out.println();
                        boolean foundStudent = false;
                        for(int i = 0; i < arrayListStudents.size(); i++) {
                            if(arrayListStudents.get(i).fullName.equals(findStudent)) {
                                foundStudent = true;
                                arrayListStudents.remove(i);
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
                        findStudent2 = input.next();
                        boolean showStudent = false;
                        for(int i = 0; i < arrayListStudents.size(); i++) {
                            if(arrayListStudents.get(i).fullName.equals(findStudent2)) {
                                showStudent = true;
                                arrayListStudents.get(i).outputInformation();
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
        input.close();
    }
}
