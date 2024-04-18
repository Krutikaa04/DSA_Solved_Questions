class Solution{
    static int evenlyDivides(int N){
        // code here
        int count =0;
        int temp = N;
        while(N !=0){
            int rem = N % 10;
            N /= 10;
            if(rem ==0){
                continue;
            }
            if(temp % rem == 0){
                count ++;
            }
        }
        return count;
        
    }
}




//sum of digits

class Solution{
    static int sumOfDigits(int N) {
        // code here
        int sum =0;
        while(N>0){
            int rem = N % 10;
            sum += rem;
            N /=10;
        }
        return sum;
    }
}