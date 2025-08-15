public class FindOddOccurrence {
    // Exactly one number appears odd number of times
    public static int findOdd(int[] arr) {
        int x = 0;
        for (int v : arr) x ^= v;
        return x;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        System.out.println(findOdd(arr)); // 5
    }
}
