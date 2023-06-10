class Solution {
    public String addStrings(String num1, String num2) {
        String s="";
        int sum=0;
        int carry=0;
        char c1[]=num1.toCharArray();
        char c2[]=num2.toCharArray();
        int i1=c1.length-1;
        int i2=c2.length-1;
        while(i1>=0 || i2>=0){
            sum=carry;
            if(i1>=0){
                sum+=c1[i1]-48;
                i1--;
            }
            if(i2>=0){
                sum+=c2[i2]-48;
                i2--;
            }
            carry=sum/10;
            s=sum%10+s;
        }
        if(carry>0){
            s=carry+s;
        }
        return s;
    }
}