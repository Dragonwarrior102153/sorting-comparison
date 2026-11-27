package kozhissery;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand;
        int len;
        try (Scanner scanner = new Scanner(System.in)) {
            rand = new Random();
            System.out.print("Size of random arr: ");
            len = scanner.nextInt();
        }

        int[] arr = new int[len];

        for (int x = 0; x < len; x++) {
            arr[x] = rand.nextInt(10000);
        }

        System.out.println("Insertion Sort:");
        InsertionSort toSort = new InsertionSort(arr);
        System.out.println(toSort.sort());

        System.out.println("\nSelection Sort:");
        SelectionSort toSort2 = new SelectionSort(arr);
        System.out.println(toSort2.sort());

        System.out.println("\nQuick Sort:");
        QuickSort toSort3 = new QuickSort(arr);
        System.out.println(toSort3.sort());
    }
}