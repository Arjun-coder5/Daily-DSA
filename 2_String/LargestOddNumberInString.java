public class LargestOddNumberInString {
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(largestOddNumber("75432")); // Output: 7543
        System.out.println(largestOddNumber("4206"));  // Output: ""
    }
}
