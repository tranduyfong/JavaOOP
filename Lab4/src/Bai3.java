import java.util.LinkedList;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> linkedList = new LinkedList<>();
        
        while (true) {
            Student newStudent = new Student();
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            if (name.isEmpty()) {
                break;
            }
                    newStudent.fullName = name;
                    System.out.print("Enter mark : ");
                    double mark = sc.nextDouble();
                    sc.nextLine();
                    newStudent.markStudent = mark;
                    linkedList.add(newStudent);
        }

        showStudentFailMark(linkedList);
        showStudentBestExams(linkedList);
        foundStudent(linkedList);
        sc.close();
    }
    
    public static void showStudent(LinkedList<Student> linkedList, int indexOfStudent) {
        System.out.println("Name : " + linkedList.get(indexOfStudent).fullName);
        System.out.println("Mark : " + linkedList.get(indexOfStudent).markStudent);
    }

    public static void showStudentFailMark(LinkedList<Student> linkedList) {
        int countStudent = 0;
        for(int i = 0; i < linkedList.size(); i++) {
            if(linkedList.get(i).markStudent <= 5) {
                ++ countStudent;
            }
        }
        System.out.println();
        System.out.println("So sinh phai thi lai la : " + countStudent);
        for(int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).markStudent <= 5) {
                showStudent(linkedList, i);
                System.out.println();
            }
        }
    }

    public static void showStudentBestExams(LinkedList<Student> linkedList) {
        Student newStudent = linkedList.getFirst();
        for(Student x : linkedList) {
            if (x.markStudent > newStudent.markStudent) {
                newStudent.markStudent = x.markStudent;
            }
        }
        System.out.println("Sinh vien co diem cao nhat la " + newStudent.markStudent);
        for(int i = 0; i < linkedList.size(); i++) {
            if(linkedList.get(i).markStudent == newStudent.markStudent) {
                showStudent(linkedList, i);
                System.out.println();
            }
        }
    }

    public static void foundStudent(LinkedList<Student> linkedList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String tmpName = sc.next();
        boolean found = false;

        for(int i = 0; i < linkedList.size(); i++) {
            if(linkedList.get(i).fullName.equals(tmpName)) {
                found = true;
                showStudent(linkedList, i);
            }
        }
        if(found == false) {
            System.out.println("Khong ton tai sinh vien do !");
        }
        sc.close();
    }
}

class Student {
    // Attributes
    public String fullName;
    public double markStudent; 

    // Methods
    public Student() {
        fullName = "";
        markStudent = 0;
    }
}