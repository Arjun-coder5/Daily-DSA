public class ReverseWords {
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            // Skip trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') i--;

            int end = i;

            // Move to the start of the word
            while (i >= 0 && s.charAt(i) != ' ') i--;

            if (end > i) {
                result.append(s.substring(i + 1, end + 1)).append(" ");
            }
        }

        // Remove last space if exists
        if (result.length() > 0) result.setLength(result.length() - 1);
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "  a   good   example  ";
        System.out.println("Output: " + reverseWords(input));  // Output: "example good a"
    }
}
