import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s) {
        Characters(s, 0, s.length - 1);
    }

    public static void Characters(char[] s, int left, int right) {
        if (left > right) return;

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        Characters(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s);
        System.out.println("Reversed: " + Arrays.toString(s));
    }
}