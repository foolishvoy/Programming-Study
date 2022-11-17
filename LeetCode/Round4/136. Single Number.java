class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        if(n == 1) return nums[0];
        for(int i = 1; i<n-1;i++){
            if(nums[i-1] != nums[i] && nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        if(nums[0] != nums[1]) return nums[0];
        else if(nums[n-2] != nums[n-1]) return nums[n-1];
        else return -1;
    }
}
