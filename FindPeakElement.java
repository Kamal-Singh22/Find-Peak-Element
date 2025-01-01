public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // Peak is in the left part
                right = mid;
            } else {
                // Peak is in the right part
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};

        System.out.println("Peak index in nums1: " + findPeakElement(nums1)); 
        System.out.println("Peak index in nums2: " + findPeakElement(nums2)); 
    }
}
