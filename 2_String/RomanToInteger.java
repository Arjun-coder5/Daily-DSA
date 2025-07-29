import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
            'I', 1, 'V', 5, 'X', 10,
            'L', 50, 'C', 100, 'D', 500, 'M', 1000
        );

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;
            result += (curr < next) ? -curr : curr;
        }

        return result;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        int result = romanToInt(roman);
        System.out.println("Roman: " + roman + " → Integer: " + result);
    }
}
