class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int low =0 , mid = 0, high = n-1;
        int temp;
        
        while(mid <= high){
            if(a[mid] == 0){
                temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
            else if(a[mid] == 1){
                mid++;
            }else{
                temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
    }
}


//the most optimal solution is through Dutch National Flag Algorithm

// lets assume the arr = {0, 1, 2, 0, 0, 1,2,0}
// in this the full unsorted array is from mid to high i.e arr[0] = mid and arr[7] = high;
// here as the whole arr is unsorted so the first element is also low therefore arr[0] = low 
// now as all the three pointers are set, if the mid has value 0 so as 0 comes first after sorting we swap the mid with low and 
// shift the low pointer by 1 and mid pointer by 1
// now if the mid has value 1 in it, it is the middle element while sorting so we wont swap it just increase the pointer of mid by 1
// now if the mid has value 2 in it, it is the highest element so we will swap mid with high and decrease high by 1;
// in this way we will sort the whole array of n elements.

// from this we come to know the time complexity of this solution as O(N) and space complexity of O(1);
// the reason behind this is that in the array of N elements while we run each iteration one element is getting sorted so init
// will take total N itersations for array of N elements so time complexity of O(N). 