class Compute {
    
    public int largest(int arr[], int n)
    {
        int largest;
        if(n < 1){
            return -1;
        }
        
        largest = Integer.MIN_VALUE;
        for(int i = 0; i< n; i++){
            largest = Math.max(largest, arr[i]);
        }
        if(largest == Integer.MIN_VALUE){
            return -1;
        }
        else{
            return largest;
        }
    }
}