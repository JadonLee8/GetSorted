import java.util.Arrays;

public class Sorter {
    private int[] unsorted;
    private int[] sorted;

    public Sorter(int[] unsorted) {
        this.unsorted = new int[unsorted.length];
        for (int i = 0; i < unsorted.length; i++) {
            this.unsorted[i] = unsorted[i];
        }
        this.sorted = new int[unsorted.length];
        for (int i = 0; i < unsorted.length; i++) {
            this.sorted[i] = unsorted[i];
        }
    }

    // returns the unsorted array
    public int[] getUnsorted() {
        return unsorted;
    }

    // returns the sorted array
    public int[] getSorted() {
        if (sorted.equals(unsorted)) {
            System.out.println("NOTICE: sorted array may not be sorted yet.");
        }
        return sorted;
    }

    // performs sort without runtime recording
    public void sort() {
        System.out.println("Performing Java built-in quicksort...");
        Arrays.sort(sorted);
    }

}
