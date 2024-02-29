//print the second largest element in an array

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int secondlarge;
        if(n < 2){
            return -1;
        }
        
        int large = secondlarge = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++)
    {
        large = Math.max(large, arr[i]);
    }
 
    
    for(int i = 0; i < n; i++)
    {
        if (arr[i] != large)
            secondlarge = Math.max(secondlarge, arr[i]);
    }
    if (secondlarge == Integer.MIN_VALUE){
        return -1;
    }
    else{
        return secondlarge;
    }
    }
}


// method 2   by slicing

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        
        if(n < 2){
            return -1;
        }

        Arrays.sort(arr);

        return arr[n - 2];
    }
}    