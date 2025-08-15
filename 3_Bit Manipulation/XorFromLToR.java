public class XorFromLToR {
    // XOR from 0..n follows pattern: n,1,n+1,0 for n%4=0..3
    private static int xorTillN(int n) {
        return switch (n & 3) {
            case 0 -> n;
            case 1 -> 1;
            case 2 -> n + 1;
            default -> 0;
        };
    }

    public static int xorFromLToR(int L, int R) {
        return xorTillN(R) ^ xorTillN(L - 1);
    }

    public static void main(String[] args) {
        System.out.println(xorFromLToR(3, 9)); // 10
    }
}
