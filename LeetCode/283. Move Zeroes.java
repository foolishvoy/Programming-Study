class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0; i<nums.length-1;i++){
            for(int j = i;j<nums.length;j++){
                if(nums[i] == 0 && nums[j] != 0){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
}
