//give the count of even and odd numbers present in the array

//time complexity is O(N)

class Solution
{
    public int[] countOddEven(int[] arr, int n)
    {
        // Code here
       int[] newarr = new int[2];
        int even=0, odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]% 2 != 0){
                odd++;
                
            }
            else{
                even ++;
            }
            
        }
        
      newarr[0] = odd;
      newarr[1] = even;
      return newarr;
        
    }
}