public class CountBitsToFlip {
    private static int countSetBits(int x) {
        int c = 0;
        while (x != 0) { x &= (x - 1); c++; }
        return c;
    }

    public static int countBitsToFlip(int a, int b) {
        return countSetBits(a ^ b);
    }

    public static void main(String[] args) {
        System.out.println(countBitsToFlip(10, 20)); // 4
    }
}
