class Solution {
//     public int mostFrequent(int[] nums, int key) {
//         int nums1[]=new int [1000];
//         int ans =0;
//         for(int i=0;i<nums.length;i++){
            
//             if(nums[i]==key){
//                nums1[nums[i]+1]++;
//                 }}
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<nums1.length;i++){
//             if(max<nums1[i]){
//                 max=nums1[i];
//                 ans=i+1;
//             }
            
//         }
            
        
//        return ans; 
        
//     }

public int mostFrequent (int []nums,int key) {
int[] result=new int[1000];
for(int i=0;i<nums.length-1;i++){
    if(nums[i] ==key){
result[nums[i+1]-1]++;
}
}
int max=Integer.MIN_VALUE;
int ans=0;
for(int i=0;i<1000;i++){
if(result[i] >max){
max=result[i];
ans=i+1;
}
}
return ans;
}}
        