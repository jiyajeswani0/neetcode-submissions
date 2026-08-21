class Solution {
    public int maxSubArray(int[] nums) {
         if(nums.length==1) return nums[0];
        int sum=nums[0];
        int cur = nums[0];
           for(int j=1;j<nums.length;j++){
                cur=Math.max(cur+nums[j],nums[j]);
                sum=Math.max(sum,cur);
           }
        
        return sum;
    }
}
