public class LargestOddNumber {
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if (ch % 2 != 0) {  // check for odd digit
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String input1 = "52";
        String input2 = "4206";
        String input3 = "35427";

        System.out.println("Input: " + input1 + " → Output: " + largestOddNumber(input1)); // "5"
        System.out.println("Input: " + input2 + " → Output: " + largestOddNumber(input2)); // ""
        System.out.println("Input: " + input3 + " → Output: " + largestOddNumber(input3)); // "35427"
    }
}
