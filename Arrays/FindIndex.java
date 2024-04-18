// Given an unsorted array arr[] of n integers and a key which is present in this array. You need to write a program 
// to find the start index( index where the element is first found from left in the array ) 
// and end index( index where the element is first found from right in the array ).(0 based indexing is used)
// If the key does not exist in the array then return -1 for both start and end index in this case.


// as the loop is only used once for whole array the time complexity is O(N);

class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int arr[], int n, int key) 
    { 
        //code here.
        int[] arr2 = new int[2];
        
        arr2[0] = -1;
        arr2[1] = -1;
        
        int start=0, end = n-1;
        
        while(start<=end){
            if(arr[start]==key && arr[end]==key){
                arr2[0] = start;
                arr2[1] = end;
                break;
            }
            if(arr[start]!= key){
                start++;
            }
            if(arr[end] != key){
                end--;
            }
        }
        return arr2;
    }
}