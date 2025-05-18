
class Solution {
    static int dataTypeSize(String str) {
        // code here
        return switch (str.toLowerCase()) {
            case "character" -> 2;
            case "integer" -> 4;
            case "long" -> 8;
            case "float" -> 4;
            case "double" -> 8;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(dataTypeSize("integer")); // Output: 4
    }
}