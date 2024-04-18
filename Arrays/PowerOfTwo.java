class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        long temp=n;
        if(n ==1){
            return true;
        }
        if(n == 0){
            return false;
        }
        // Your code here
        while(temp>1){
            if(temp % 2 !=0){
                return false;
            }
            temp /= 2;
        }
        
        return true;
    }
    
}
