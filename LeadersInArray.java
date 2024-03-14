// Given an array A of positive integers. Your task is to find the leaders in the array. 
// An element of array is a leader if it is greater than or equal to all the elements to its right side.
// The rightmost element is always a leader. 

// Time complexity is O[N];

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        int ans = arr[n-1];
        result.add(ans);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=ans){
                result.add(0,arr[i]);
                ans = arr[i];
            }
        }
        return result;
    }
}
