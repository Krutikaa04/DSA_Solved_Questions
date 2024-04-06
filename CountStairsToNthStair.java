class Solution {
    // Function to count number of ways to reach the nth stair
    // when order does not matter.
    Long countWays(int n) {
        // your code here
        return (long)n/2+1;
    }
}


// Time and Space complexity is O(N)...
// There are n stairs, and a person standing at the bottom wants to reach the top.
// The person can climb either 1 stair or 2 stairs at a time.
// Count the number of ways, the person can reach the top (order does not matter).

// So in this basically just count how many times the sum of n is obtained with only 1 and 2;

// this can be obtained by the formula (n/2)+1;