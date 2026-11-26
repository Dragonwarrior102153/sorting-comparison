package kozhissery;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        InsertionSort toSort = new InsertionSort(arr);
        System.out.println(toSort.sort());

        SelectionSort toSort2 = new SelectionSort(arr);
        System.out.println(toSort2.sort());
    }
}