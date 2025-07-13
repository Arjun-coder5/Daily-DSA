public class CountOccurrences {

    public static int countFrequency(int[] nums, int target) {
        int first = FirstLastOccurrence.findFirst(nums, target);
        if (first == -1) return 0;
        int last = FirstLastOccurrence.findLast(nums, target);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 4, 5, 6, 7};
        int target = 4;
        System.out.println("Frequency of " + target + " is: " + countFrequency(nums, target));
    }
}
