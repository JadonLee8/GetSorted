import java.util.Arrays;

public class Sorter {
    private int[] unsorted;
    private int[] sorted;

    public Sorter(int[] unsorted) {
        this.unsorted = unsorted;
        this.sorted = unsorted;
    }

    public int[] getUnsorted() {
        return unsorted;
    }

    public int[] getSorted() {
        if (sorted == unsorted) {
            System.out.println("NOTICE: sorted array may not be sorted yet.");
        }
        return sorted;
    }

    // performs sort without runtime recording
    public void sort() {
        System.out.println("Performing Java built-in quicksort...");
        Arrays.sort(sorted);
    }

    // performs sort with runtime recording
    public void performSort() {
        long startTime = System.nanoTime();
        sort();
        long endTime = System.nanoTime();
        System.out.println("Sort completed in " + (endTime - startTime) + " nanoseconds.");
    }
}
