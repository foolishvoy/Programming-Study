class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        if(nums.length == 0) return -1;

        while(i<=j){
            int mid = i + (j-i)/2;
            if(target == nums[mid]) return mid;
            else if(target > nums[mid]) i = mid+1;
            else j = mid-1;
        }
        return -1;
    }
}
