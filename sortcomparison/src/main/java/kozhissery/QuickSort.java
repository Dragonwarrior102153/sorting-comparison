package kozhissery;

public class QuickSort extends Sort {

    public QuickSort() {
        super();
    }

    public QuickSort(int[] unsortedArr) {
        super(unsortedArr);
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[high];
        arr[high] = arr[i + 1];
        arr[i + 1] = temp;

        return i + 1; // the index of the pivot

    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    @Override
    public SortingDetails sort() {
        long startTime = System.nanoTime();

        quickSort(this.unsortedArr, 0, this.unsortedArr.length - 1);

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        int[] sortedArr = this.unsortedArr;

        return new SortingDetails(sortedArr, elapsedTime);
    }
}
