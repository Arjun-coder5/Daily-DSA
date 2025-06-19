public class RemoveOutermostParentheses {
    public static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (count > 0) ans.append(ch);
                count++;
            } else if (ch == ')') {
                count--;
                if (count > 0) ans.append(ch);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String input = "(()())(())";
        System.out.println("Output: " + removeOuterParentheses(input));  // Output: "()()()"
    }
}
