public class CountSetBits {
    public static int countSetBits(int num) {
        int count = 0;
        while (num != 0) {
            num &= (num - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 29; // 11101 → 4 set bits
        System.out.println("Set bits in " + num + ": " + countSetBits(num));
    }
}
