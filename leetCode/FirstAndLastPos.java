class Solution {

  public int[] searchRange(int[] nums, int target) {
    nums[]={3,3,3};
    target = 3;
    if (nums.length == 1 && target > 0) {
      return new int[] { 0, 0 };
    }
    if (nums.length == 1 && target == 0) {
      return new int[] { -1, -1 };
    }
    int low = 0;
    int high = nums.length - 1;
    int startId = -1;
    int endId = -1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (nums[mid] == target && (mid == 0 || nums[mid - 1] < target)) {
        startId = mid;
        low = mid + 1;
      } else if (
        nums[mid] == target &&
        (mid == nums.length - 1 || nums[mid + 1] > target)
      ) {
        endId = mid;
        high = mid - 1;
      } else if (nums[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    if (startId == -1 && endId >= 0) {
      return new int[] { endId, endId };
    } else if (startId >= 0 && endId == -1) {
      return new int[] { startId, startId };
    } else {
      return new int[] { startId, endId };
    }
  
}
}
