class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
        return 1;
    }
    if (n < 0) {
        if (n == Integer.MIN_VALUE) {
            return 1 / (myPow(x, Integer.MAX_VALUE) * x);
        } else {
            return 1 / myPow(x, -n);
        }
    }
    
    double half_power = myPow(x, n / 2);
    half_power = half_power * half_power;
    
    if (n % 2 != 0) {
        half_power = x * half_power;
    }
    
    return half_power;
        
    }
}