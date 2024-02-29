class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    if(n < 3){
	        return -1;
	    }
	    Arrays.sort(a);
	    
	    return a[n - 3];
	    
    }
}


//the best and efficient method used here is slicing wherein directly the third last element can be printed