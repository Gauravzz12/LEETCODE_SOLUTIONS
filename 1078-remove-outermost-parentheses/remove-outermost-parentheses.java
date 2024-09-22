class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        int count=0;
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
            if(c=='(' && count>=1){
            count++;
            ans+=c;}
            else if(c==')' && count>=2){
                count--;
                ans+=c;
            }
            else if(count==0 && c=='(')
            count=1; 
            else count=0;
        }
        return ans;
    }
}