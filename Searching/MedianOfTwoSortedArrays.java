public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);

        int x = nums1.length, y = nums2.length;
        int low = 0, high = x;

        while (low <= high) {
            int cutX = (low + high) / 2;
            int cutY = (x + y + 1) / 2 - cutX;

            int leftX = (cutX == 0) ? Integer.MIN_VALUE : nums1[cutX - 1];
            int rightX = (cutX == x) ? Integer.MAX_VALUE : nums1[cutX];

            int leftY = (cutY == 0) ? Integer.MIN_VALUE : nums2[cutY - 1];
            int rightY = (cutY == y) ? Integer.MAX_VALUE : nums2[cutY];

            if (leftX <= rightY && leftY <= rightX) {
                if ((x + y) % 2 == 0)
                    return (Math.max(leftX, leftY) + Math.min(rightX, rightY)) / 2.0;
                else
                    return Math.max(leftX, leftY);
            } else if (leftX > rightY)
                high = cutX - 1;
            else
                low = cutX + 1;
        }

        return 0.0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median: " + findMedianSortedArrays(nums1, nums2)); // Output: 2.0
    }
}
