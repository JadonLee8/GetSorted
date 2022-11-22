public class DataCreator {
    public static int[] CreateRandomIntArr(int len, int min, int max){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        return arr;
    }
}
