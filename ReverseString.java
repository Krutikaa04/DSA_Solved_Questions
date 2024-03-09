class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String str2 = "";
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            str2 = ch+ str2;
        }
        return str2;
    }
}


//time complexity is O(N) as loop is run once.