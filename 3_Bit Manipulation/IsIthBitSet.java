public class IsIthBitSet {
    public static boolean isIthBitSet(int num, int i) {
        return (num & (1 << i)) != 0;
    }

    public static void main(String[] args) {
        int num = 5, i = 1; // 5 = 101 (binary)
        System.out.println("Is " + i + "-th bit set in " + num + "? " + isIthBitSet(num, i));
    }
}
