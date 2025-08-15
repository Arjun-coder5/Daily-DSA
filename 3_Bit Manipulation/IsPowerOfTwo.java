public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println(num + " is power of two? " + isPowerOfTwo(num));
    }
}
