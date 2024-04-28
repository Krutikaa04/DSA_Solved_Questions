class Solution {
    
    public String reverse(String S){
        //code here
        String st = "";
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i< S.length(); i++){
            stack.push(S.charAt(i));
        }
        
        int i = 0;
        while(!stack.isEmpty()){
            st += stack.pop();
        }
        return st; 
    }

}