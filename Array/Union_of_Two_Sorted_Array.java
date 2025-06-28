import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class Union_of_Two_Sorted_Array {

    // Method to find union of two sorted arrays
    public ArrayList<Integer> findUnion(int[] a, int[] b) {
        int i = 0, j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        Integer last = null;

        while (i < a.length && j < b.length) {
            int val;
            if (a[i] < b[j]) val = a[i++];
            else if (a[i] > b[j]) val = b[j++];
            else {
                val = a[i];
                i++;
                j++;
            }
            if (!Objects.equals(last, val)) {
                res.add(val);
                last = val;
            }
        }

        while (i < a.length) {
            if (!Objects.equals(last, a[i])) {
                res.add(a[i]);
                last = a[i];
            }
            i++;
        }

        while (j < b.length) {
            if (!Objects.equals(last, b[j])) {
                res.add(b[j]);
                last = b[j];
            }
            j++;
        }

        return res;
    }

    // Main method with prompts for user input
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of test cases: ");
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            System.out.print("Enter elements of first sorted array (space-separated): ");
            String[] str1 = br.readLine().trim().split(" ");
            int[] a = new int[str1.length];
            for (int i = 0; i < str1.length; i++) {
                a[i] = Integer.parseInt(str1[i]);
            }

            System.out.print("Enter elements of second sorted array (space-separated): ");
            String[] str2 = br.readLine().trim().split(" ");
            int[] b = new int[str2.length];
            for (int i = 0; i < str2.length; i++) {
                b[i] = Integer.parseInt(str2[i]);
            }

            Union_of_Two_Sorted_Array obj = new Union_of_Two_Sorted_Array();
            ArrayList<Integer> res = obj.findUnion(a, b);

            System.out.print("Union of arrays: ");
            for (int val : res) {
                System.out.print(val + " ");
            }
            System.out.println("\n~");  // Separator between test cases
        }
    }
}
