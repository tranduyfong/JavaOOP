import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp;
        System.out.print("n = ");
        n = sc.nextInt();
        int [] array = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.print("A[" + i + "] = ");
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(array[i] + "\t");
        }
        for(int i = 0; i < n-1; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(array[i] + "\t");
        }
    }
}
