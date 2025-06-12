
public class ValidPalindromeRecursive {

    public boolean isPalindrome(String s) {
        // Clean the string: remove non-alphanumeric and convert to lowercase
        StringBuilder cleaned = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }

        return isPalindromeRecursive(cleaned.toString(), 0, cleaned.length() - 1);
    }

    public boolean isPalindromeRecursive(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindromeRecursive(s, left + 1, right - 1);
    }

    // Sample test
    public static void main(String[] args) {
        ValidPalindromeRecursive sol = new ValidPalindromeRecursive();
        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(sol.isPalindrome("race a car"));                     // false
        System.out.println(sol.isPalindrome(" "));                              // true
    }
}