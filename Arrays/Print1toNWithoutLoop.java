
class Solution
{

  public void printNos(int N)
    {
        if(N > 0) {
            printNos(N - 1);
            System.out.print(N + " ");
        }
        return 0;
    }
    
}

//refer gfg 'recursions' for perfect understanding of recursions