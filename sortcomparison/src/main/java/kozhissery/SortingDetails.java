package kozhissery;

public record SortingDetails(int[] sortedArr, float time) {
    @Override
    public String toString() {
        String s = "Sorted Array: ";
        s += "\ntime = " + time / 100000;

        return s;
    }
}
