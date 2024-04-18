class Solution{
        
    static int search(int arr[], int N, int X)
    {
        if(N<1){
            return -1;
        }
        int point = arr[0];
        // Your code here
        for(int i=0;i<N;i++){
            if(arr[i] != X){
               point++; 
            }
            else{
                return i;
            }
        }
        return -1;
        
    }
    
}


//as the loop is run only once for whole array time complexity is O(N)



//search element in sorted array 

class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        if(N<1){
            return -1;
        }
        for(int i=0; i<N; i++){
            if(arr[i] == K){
                return 1;
            }
        }
        return -1;
    }
}