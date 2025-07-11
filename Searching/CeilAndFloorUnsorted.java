// File: CeilAndFloorUnsorted.java
public class CeilAndFloorUnsorted {
    public static int[] getFloorAndCeil(int[] arr, int x) {
        int floor = -1;
        int ceil = -1;

        for (int num : arr) {
            if (num <= x) {
                if (floor == -1 || num > floor) floor = num;
            }
            if (num >= x) {
                if (ceil == -1 || num < ceil) ceil = num;
            }
        }

        return new int[]{floor, ceil};
    }

    public static void main(String[] args){
        int[] arr = {5, 6, 8, 9, 6, 5, 5, 6};
        int x = 7;
        int[] res = getFloorAndCeil(arr, x);
        System.out.println("Floor: " + res[0] + ", Ceil: " + res[1]);
    }
}
