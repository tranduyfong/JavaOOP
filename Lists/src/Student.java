import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    Scanner input = new Scanner(System.in);
    // Attributes
    public String fullName;
    public int age;
    public ArrayList<String> otherInformation;

    // Methods
    public Student() {
        this.fullName = "";
        this.age = 0;
        this.otherInformation = new ArrayList<>();
    }

    // Phuong thuc nhap thong tin
    public void inputInfomartion() {
        System.out.print("Nhap ten : ");
        fullName = input.next();
        System.out.print("Nhap tuoi : ");
        age = input.nextInt();
        System.out.println();
        addInformation();
    }
    public void outputInformation() {
        System.out.println();
        System.out.println("HoTen : " + fullName);
        System.out.println("Tuoi : " + age);
        for(var x : otherInformation) {
            System.out.println(x);
        }
        System.out.println();
    }

    public void addInformation() {
        while (true) {
            System.out.println("Moi ban nhap thong tin can nhap them !");
            System.out.println("Go 0 neu ban muon thoat !");
            System.out.println();
            System.out.print("Moi ban nhap : ");
            String inforStudent;
            inforStudent = input.next();
            System.out.println();

            if(inforStudent.equals("0")) {
                break;
            } else {
                    otherInformation.add(inforStudent);
                    input.nextLine();
            }
        }
    }
    public void updateInformation() {
        String inputSelection;
        System.out.println("Moi ban nhap thong tin can chinh sua : ");
        inputSelection = input.next();
        System.out.println();
        if (inputSelection.startsWith("HoTen")) {
            System.out.print("Nhap ten moi : ");
            fullName = input.next();
            System.out.println("Thay doi thanh cong !");
            System.out.println();
        } else if (inputSelection.startsWith("Tuoi")) {
            System.out.print("Nhap tuoi moi : ");
            age = input.nextInt();
            System.out.println("Thay doi thanh cong !");
            System.out.println();
        } else {
            boolean checkChange = false;
            for(int i = 0; i < otherInformation.size(); i++) {
                if (otherInformation.get(i).startsWith(inputSelection)) {
                    System.out.print("Nhap " + inputSelection + " moi : ");
                    String newInformation = input.next();
                    otherInformation.set(i, inputSelection + " : " + newInformation);
                    System.out.println("Thay doi thanh cong !");
                    System.out.println();
                    checkChange = true;
                }
            }
            if (!checkChange) {
                System.out.println("Khong ton tai thong tin do !");
                System.out.println();
            }
        }
    }
}