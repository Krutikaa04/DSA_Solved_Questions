class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        int i=0, j=1;
        while(j<N){
            if(A[i]!=A[j]){
                A[i+1]=A[j];
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i+1;
    }
}


//time complexity of this optimal solution is O(N)
