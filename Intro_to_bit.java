public class  Intro_to_bit {
    static boolean isSet(int n, int i) {
        return (n & (1 << (i - 1))) != 0;
    }

    public static void main(String[] args) {
        int n = 70, i = 3;
        System.out.println(isSet(n, i)); // Output: true
    }
}
