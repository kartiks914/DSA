class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length){
            if(nums[i]>nums[i+1]){
                inc = false;
            }
            if(nums[i]<nums[i+1]){
                dec=false;
            }}
            
        }
        return inc||dec;
    }
}