public class Arrays {
    public static void swapLargestAndSmallest(int[] a) {
        int smallestNumber = a[0];
        int smallestIndex = 0;
        int biggestIndex = 0;
        int biggestNumber = a[0];
        for (int i = 1; i < a.length; i++) {
            if (smallestNumber > a[i]) {
                smallestNumber = a[i];
                smallestIndex = i;
            }
            if (biggestNumber <= a[i]) {
                biggestNumber = a[i];
                biggestIndex = i;
            }
        }
        a[smallestIndex] = biggestNumber;
        a[biggestIndex] = smallestNumber;
    }

    public static String toString(int[] a) {
        String string = "";
        for (int i = 0; i < a.length; i++)
            string += a[i] + " ";
        return string;
    }
}
