package kozhissery;

import java.util.Arrays;

public record SortingDetails(int[] sortedArr, float time) {
    @Override
    public String toString() {
        String s = "Sorted Array: " + Arrays.toString(sortedArr);
        s += "\ntime = " + time;

        return s;
    }
}
