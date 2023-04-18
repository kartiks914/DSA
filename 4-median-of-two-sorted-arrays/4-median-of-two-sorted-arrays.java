class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m=nums2.length;
        int s=n+m;
        int  s1[]=new int[s];
        double median=0;
        System.arraycopy(nums1, 0, s1, 0, n);
		System.arraycopy(nums2, 0, s1, n, m);
        Arrays.sort(s1);
        if(s%2==0){
           int  a=(s/2);
            median=(double)(s1[a]+s1[a-1])/2;
            
        }
        else{
            median=s1[s/2];
        }
        return median ;
    }
        
}