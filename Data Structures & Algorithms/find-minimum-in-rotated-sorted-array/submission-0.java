class Solution {
    public int findMin(int[] nums) {
        // Edge: single element is already the minimum.
        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0;
        int right = nums.length - 1;

        // Already fully sorted (rotation of 0): first element is min.
        if (nums[left] < nums[right]) {
            return nums[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2; // Added semicolon

            // Right half [mid, right] is sorted -> min is at mid or left of mid
            if (nums[mid] <= nums[right]) { // Fixed missing closing bracket
                right = mid; // keep mid in the search space
            } else {
                // Mid is in the left (larger) sorted run; min is strictly right of mid.
                left = mid + 1;
            }
        }
        
        // left == right; both point at the minimum.
        return nums[left]; // Fixed typo (was num[left])
    }
}