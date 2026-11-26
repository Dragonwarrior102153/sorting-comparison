package kozhissery;

public class InsertionSort extends Sort {

    public InsertionSort() {
        super();
    }

    public InsertionSort(int[] unsortedArr) {
        super(unsortedArr);
    }

    @Override
    public SortingDetails sort() {
        long startTime = System.nanoTime();

        for (int i = 0; i < this.unsortedArr.length; i++) {
            int key = this.unsortedArr[i];
            int j = i - 1;

            while (j >= 0 && key < this.unsortedArr[j]) {
                this.unsortedArr[j + 1] = this.unsortedArr[j];
                j--;
            }
            this.unsortedArr[j + 1] = key;
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        // ik its inefficient but i dont like returning a var called unsorted array when
        // its lit sorted
        int[] sortedArray = this.unsortedArr;

        return new SortingDetails(sortedArray, elapsedTime);
    }
}