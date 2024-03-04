//swap the i th element with i+2 th element

//time complexity is O(N) as loop is run once for whole array.


class Solution
{
    public void swapElements(int[] arr, int n)
    {
        // Code here

        int temp = 0;
        for(int i=0; i+2<n; i++){
            temp = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = temp;
           
        }
        
    }
}