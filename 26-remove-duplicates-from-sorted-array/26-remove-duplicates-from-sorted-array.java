class Solution {
    public int removeDuplicates(int[] nums) {
        int temp=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
              nums[temp]=nums[i];
              temp++;
            }
           
                   
            }
            return temp;
                }
    }
