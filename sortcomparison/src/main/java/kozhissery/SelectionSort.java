package kozhissery;

public class SelectionSort extends Sort {

    public SelectionSort() {
        super();
    }

    public SelectionSort(int[] unsortedArr) {
        super(unsortedArr);
    }

    @Override
    public SortingDetails sort() {
        long startTime = System.nanoTime();

        int len = this.unsortedArr.length;
        for (int i = 0; i < len; i++) {
            int minVal = this.unsortedArr[i];
            int minInd = i;
            for (int j = i; j < len; j++) {
                if (this.unsortedArr[j] < minVal) {
                    minVal = this.unsortedArr[j];
                    minInd = j;
                }
            }
            this.unsortedArr[minInd] = this.unsortedArr[i];
            this.unsortedArr[i] = minVal;
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        int[] sortedArray = this.unsortedArr;

        return new SortingDetails(sortedArray, elapsedTime);
    }
}
