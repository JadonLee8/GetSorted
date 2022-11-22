public class Main{
    public static void main(String[] args){
        Sorter base = new Sorter(DataCreator.CreateRandomIntArr(100000, 0, 100000));
        base.performSort();
    }
}