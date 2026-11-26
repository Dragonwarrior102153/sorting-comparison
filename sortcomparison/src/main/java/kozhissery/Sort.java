package kozhissery;

public abstract class Sort {
    private int[] unsortedArr;

    public Sort(){
        this.unsortedArr = [1,6,0,3,2,7];
    }

    public Sort(int[] unsortedArr){
        this.unsortedArr = unsortedArr;
    }

    public abstract SortingDetails sort(int[] unsortedArr);
}
