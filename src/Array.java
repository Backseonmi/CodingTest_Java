import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {3, 2, 0, 1, 4};
        int idx = Arrays.binarySearch(arr, 2);
        String[] name = {"백선미", "안소영"};
        System.out.println(name);
        System.out.println(idx);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int inx = Arrays.binarySearch(arr, 2);
        System.out.println(inx);
    }
}
