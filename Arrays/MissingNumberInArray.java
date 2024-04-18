// Given an array of size N-1 such that it only contains distinct integers 
// in the range of 1 to N. 
// Find the missing element.


class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        for(int i=0;i<n-1;i++){
            if(i+1 != array[i]){
                return i+1;
            }
        }
        return n;
       
        
    }
}