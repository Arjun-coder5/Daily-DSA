/**
 * Author: Arjun
 * Question Link: https://www.geeksforgeeks.org/problems/data-type-quiz/1
 * 
 * Description:
 * This program defines a method to return the size (in bytes) of a given 
 * primitive data type in Java based on a string input. If the input does 
 * not match a known type, it returns -1.
 */

public class DataTypeSizeChecker {

    static int dataTypeSize(String str) {
        if (str == null) {
            return -1;
        }

        switch (str.toLowerCase()) {
            case "character":
                return 2;
            case "integer":
                return 4;
            case "long":
                return 8;
            case "float":
                return 4;
            case "double":
                return 8;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(dataTypeSize("Integer"));   // Output: 4
        System.out.println(dataTypeSize("Character")); // Output: 2
        System.out.println(dataTypeSize("Boolean"));   // Output: -1
    }
}
