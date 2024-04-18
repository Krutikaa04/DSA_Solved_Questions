// Given two arrays a[] and b[] of size n and m respectively. 
// The task is to find the number of elements in the union between these two arrays.


class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Set<Integer> union = new HashSet<Integer>();
        
        for(int i=0;i<n;i++){
            union.add(a[i]);
        }
        
        for(int i=0;i<m;i++){
            union.add(b[i]);
        }
        
        return union.size();
    }
}