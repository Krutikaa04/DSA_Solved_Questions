//print the second largest element in an array

//best optimal method with time complexity O(N)

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int largest = arr[0];
        int secondlargest = -1;
        if(n < 2){
            return -1;
        }
        for(int i = 1; i< n; i++){
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondlargest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
}

//explanation of the optimal code

// consider the first element of array as largest and while initializing give -1 to secondlargest as the minimum value.
// as first element is assigned to largest loop will run from second element to end of array. now if the second element is greater than the first
// element which is assigned to largest the second element becomes largest and first element becomes secondlargest.
// the loop goes on. now if a condition arises where in if the element is smaller than the largest but is greater than the secondlargest,
// the element is assigned to secondlargest. in the end we return the secondlargest value.

// the time complexity is O(N) as the loop is run only once through the array of N elements and so is the optimal solution


//method 2
class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int secondlarge;
        if(n < 2){
            return -1;
        }
        
        int large = secondlarge = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++)
    {
        large = Math.max(large, arr[i]);
    }
 
    
    for(int i = 0; i < n; i++)
    {
        if (arr[i] != large)
            secondlarge = Math.max(secondlarge, arr[i]);
    }
    if (secondlarge == Integer.MIN_VALUE){
        return -1;
    }
    else{
        return secondlarge;
    }
    }
}


// method 3   by slicing

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        
        if(n < 2){
            return -1;
        }

        Arrays.sort(arr);

        return arr[n - 2];
    }
}    