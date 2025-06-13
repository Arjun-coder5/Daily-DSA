import java.util.*;

public class FrequencyCounter {

    // Function to count the frequency of all elements from 1 to N in the array
    public static List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        int[] hash = new int[n + 1];

        // Count frequency only for values from 1 to n
        for (int i = 0; i < n; i++) {
            if (arr[i] <= n) {
                hash[arr[i]]++;
            }
        }

        // Prepare the result list with frequencies from 1 to n
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(hash[i]);
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        List<Integer> frequency = frequencyCount(arr);

        System.out.println("Frequency of elements from 1 to " + arr.length + ":");
        for (int i = 0; i < frequency.size(); i++) {
            System.out.println((i + 1) + " -> " + frequency.get(i));
        }
    }
}
