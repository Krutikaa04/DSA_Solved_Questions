class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        
        for(int i=0; i<N; i++){
            if(max > A[i]){
                max = A[i];
                }
            if(min < A[i]){
                min = A[i];
                }
            }
            return max + min;
    }
}
