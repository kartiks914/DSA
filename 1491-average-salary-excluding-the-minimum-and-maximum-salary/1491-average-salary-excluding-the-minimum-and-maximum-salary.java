class Solution {
    public double average(int[] salary)
     {      int size=salary.length;
            double sum =0;
            int max = salary[0];
            int low = salary[0];
        for(int i=0;i<salary.length;i++){
            
                if(max <salary[i])
                {
                    max= salary[i];
                }
                if(low > salary[i]){
                    low= salary[i];
                }
                 
                sum  = sum + salary[i];
            }
            double avg= (sum - (max+low))/(size-2);
           return avg;
        }
    }
