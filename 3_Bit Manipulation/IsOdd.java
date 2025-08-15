public class IsOdd {
    public static boolean isOdd(int num) {
        return (num & 1) != 0;
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println(num + " is odd? " + isOdd(num));
    }
}
