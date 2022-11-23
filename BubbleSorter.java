public class BubbleSorter extends Sorter {
    public BubbleSorter(int[] unsorted) {
        super(unsorted);
    }

    // performs bubble sort
    public void sort() {
        System.out.println("Performing bubble sort...");
        int[] arr = getUnsorted();
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    // TODO: add swap method to parent class
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        setSorted(arr);
    }
    
}
