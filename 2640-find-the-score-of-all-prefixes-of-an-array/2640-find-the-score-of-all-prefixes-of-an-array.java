class Solution {
    public long[] findPrefixScore(int[] nums) {
        long arr[]=new long[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            arr[i]=max+nums[i]+((i==0)? 0: arr[i-1]);
        }
        
        return arr;
        
    }
}