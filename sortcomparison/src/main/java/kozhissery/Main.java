package kozhissery;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand;
        int len;
        String arrType;
        try (Scanner scanner = new Scanner(System.in)) {
            rand = new Random();
            System.out.print("Type of array: ");
            arrType = scanner.nextLine();

            System.out.print("Size of random arr: ");
            len = scanner.nextInt();
        }

        int[] arr = new int[len];

        switch (arrType) {
            case ("Random") -> {
                for (int x = 0; x < len; x++) {
                    arr[x] = rand.nextInt(10000);
                }
            }

            case ("Ascending") -> {
                for (int x = 0; x < len; x++) {
                    arr[x] = x;
                }
            }

            case ("Descending") -> {
                for (int x = 0; x < len; x++) {
                    arr[x] = len - x;
                }
            }
        }

        System.out.println("Insertion Sort:");
        InsertionSort toSort = new InsertionSort(arr.clone());
        System.out.println(toSort.sort());

        System.out.println("\nSelection Sort:");
        SelectionSort toSort2 = new SelectionSort(arr.clone());
        System.out.println(toSort2.sort());

        System.out.println("\nQuick Sort:");
        QuickSort toSort3 = new QuickSort(arr.clone());
        System.out.println(toSort3.sort());
    }
}