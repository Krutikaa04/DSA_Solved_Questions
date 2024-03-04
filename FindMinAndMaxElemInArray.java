class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long max = a[0];
        long min = a[0];
        
        for(int i = 1; i<n;i++){
            if(a[i] < min){
                min = a[i];
            }
            if(a[i]> max){
                max = a[i];
            }
            
        }
        return new Pair(min, max);
        
    }
}


//time complexity is O(N) as the loop is only run once for the array