// Given two arrays a[] and b[] respectively of size n and m, 
// the task is to print the count of elements in the intersection (or common elements) of the two arrays.

class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        
        for(int i=0;i<n;i++){
            set1.add(a[i]);
        }
        for(int i=0;i<m;i++){
            set2.add(b[i]);
        }
        
        set1.retainAll(set2);
        
        return set1.size();
        
    }
};