import java.util.*;

public class Tester {
    public static void main(String[] args) {
        int[] a = new int[] {5, 4, 1, 9, 2, 6};
        System.out.println(Arrays.toString(a));
        Arrays.swapLargestAndSmallest(a);
        System.out.println(Arrays.toString(a));
        a = new int[] {1, 4, 1, 9, 2, 6};
        Arrays.swapLargestAndSmallest(a);
        System.out.println(Arrays.toString(a));
    }
}
