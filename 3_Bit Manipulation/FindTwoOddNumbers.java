import java.util.Arrays;

public class FindTwoOddNumbers {
    // Exactly two numbers appear odd number of times; others appear even times
    public static int[] findTwoOdd(int[] arr) {
        int xor = 0;
        for (int v : arr) xor ^= v;
        int rightmostSetBit = xor & -xor;
        int a = 0, b = 0;
        for (int v : arr) {
            if ((v & rightmostSetBit) != 0) a ^= v;
            else b ^= v;
        }
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] arr = {4, 4, 3, 3, 5, 5, 7, 9};
        System.out.println(Arrays.toString(findTwoOdd(arr))); // [7, 9] (order may vary)
    }
}
