class Solution 
{ 
    int sameChar(String A, String B) 
    {
        // code here
        A = A.toLowerCase();
        B = B.toLowerCase();
        
        int count = 0;
        for(int i = 0;i<A.length();i++){
            if(A.charAt(i)==B.charAt(i)){
                count++;
            }
        }
        return count++;
        
    }
} 