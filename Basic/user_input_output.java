/*
Problem: Return size of data type
Link   : (https://www.geeksforgeeks.org/problems/data-type-identifier)
Idea   : Use switch-case to check input string and return corresponding size in bytes
Author : Arjun-coder5
*/

class Solution {
    static int dataTypeSize(String str) {
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
}
