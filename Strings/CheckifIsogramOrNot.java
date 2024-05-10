class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        //Your code here
       int count[] = new int[256];
       for(int i=0;i<data.length();i++){
           count[data.charAt(i)]++;
       }
       
       for(int i=0;i<256;i++){
           if(count[i]>1){
               return false;
           }
       }
       return true;
    }
}

//isogram is a string having no repeating letter