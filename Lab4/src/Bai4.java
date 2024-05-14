import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        HashSet<String> fruitHashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String nameFruit;
            System.out.print("Enter name : ");
            nameFruit = sc.nextLine();
            if (nameFruit.isEmpty()) {
                break;
            }
            fruitHashSet.add(nameFruit);
        }

        sizeList(fruitHashSet);
        checkFruit(fruitHashSet);
        deletedFruit(fruitHashSet);
        showSet(fruitHashSet);


        // Create the list fruit
        ArrayList<String> fruitArrayList = new ArrayList<>();
        fruitArrayList.add("BlueBerrys");
        fruitArrayList.add("Mango");
        fruitArrayList.add("Toad");
        fruitArrayList.add("Apple");
        fruitArrayList.add("Melon");
        fruitArrayList.add("Passion");

        // Add
        for(String x : fruitArrayList) {
            fruitHashSet.add(x);
        }

        // Create Iterator
        Iterator<String> fruitIterator = fruitHashSet.iterator();
        System.out.println();
        System.out.println("List fruit : ");
        while (fruitIterator.hasNext()) {
            System.out.print(fruitIterator.next() + " ");
        }
        System.out.println();

        // Delete
        fruitHashSet.removeAll(fruitArrayList);
        System.out.println();
        showSet(fruitHashSet);
    }

    // Function showSet
    public static void showSet(HashSet<String> hashSet) {
        System.out.println("List friut : ");
        for(String x : hashSet) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Function caculated size list
    public static void sizeList(HashSet<String> hashSet) {
        System.out.println("Size of list : " + hashSet.size());
        System.out.println();
    }

    // Function found fruit
    public static void checkFruit(HashSet<String> hashSet) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name fruit to found : ");
        String nameFruit = sc.next();
        if (hashSet.contains(nameFruit)) {
            System.out.println(nameFruit + " to be in the set !");
        } else {
            System.out.println(nameFruit + " not to be in the set !");
        }
        System.out.println();
    }

    // Function deleted fruit
    public static void deletedFruit(HashSet<String> hashSet) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name fruit to deleted : ");
        String nameFruit = sc.next();
        
        if (hashSet.contains(nameFruit)) {
            hashSet.remove(nameFruit);
            System.out.println("Succeced to deleted !");
        } else {
            System.out.println("Not to be that fruit !");
        }
        System.out.println();
    }
}
