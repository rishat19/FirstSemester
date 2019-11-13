import java.util.Random;
import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of elements in the array");
        final int arraySize = sc.nextInt();
        int[] myArray = new int[arraySize];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt();
        }
        insertionSort(myArray);
        for (int value : myArray) {
            System.out.println(value);
        }
    }
    public static void insertionSort(int[] Array) {
        for (int i = 1; i < Array.length; i++) {
            int j = i - 1;
            while (j >= 0 && Array[j] > Array[j + 1]) {
                int a = Array[j]; //swap
                Array[j] = Array[j + 1];
                Array[j + 1] = a;
                j--;
            }
        }
    }
}