class Solution {
    public boolean isValid(String s) {
       Stack<Character>st = new Stack<>();
       if(s.length()%2!=0) return false;
       for(int i = 0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch==')'){
            if( st.isEmpty() || st.peek()!='(') 
            {
                return false;
            }
            else st.pop();
        }
        else if(ch=='}'){
            if(  st.isEmpty()|| st.peek()!='{') 
            {
                return false;
            }
            else st.pop();
        }
        else if(ch==']'){
            if(st.isEmpty() || st.peek()!='[' ) 
            {
                return false;
            }
            else st.pop();
       } 
       else st.add(ch);
       }
       if(st.isEmpty()) return true;
       return false;
    }
}
