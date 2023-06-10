class Solution {
    public int countOdds(int low, int high) {
        int bitmask=1;
        int count =0;
        for(int i=low;i<=high;i++){
            if((i & bitmask)!=0){
                count ++;
            }
        }
        return count;
    }
}