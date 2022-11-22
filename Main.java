public class Main{
    public static void main(String[] args){
        Tester test = new Tester();
        int numTests = 10;
        long totalTime = test.testSorter(numTests, 1000, 0, 1000);
        long avgTime = totalTime/numTests;
        System.out.print("Total time taken: ");
        System.out.printf("%,d", totalTime);
        System.out.println(" nanoseconds");
        System.out.print("Average time taken: ");
        System.out.printf("%,d", avgTime);
        System.out.println(" nanoseconds.");
    }
}