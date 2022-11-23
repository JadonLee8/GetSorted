public class Tester {
    //TODO: need to implement functionality to change with sorter the ethod tests otherwise make a bunch of tester methods for each sorter
    // returns average test time over many trials
    public long testSorter(int numTests, int len, int min, int max) {
        long sum = 0; 
        for (int i = 0; i < numTests; i++) {
            Sorter sorter = new Sorter(DataCreator.CreateRandomIntArr(len, min, max));
            sum += performSort(sorter);
        }
        return (sum);
    }
        
    // returns time taken to sort for one trial
    public long performSort(Sorter sorter) {
        long startTime = System.nanoTime();
        sorter.sort();
        long endTime = System.nanoTime();
        System.out.print("Time taken: ");
        System.out.printf("%,d", (endTime - startTime));
        System.out.println(" nanoseconds");
        return (endTime - startTime);
    }

    // TODO: implement method
    public boolean compareSorts(Sorter sorter1, Sorter sorter2) {
        return false;
    }
}
