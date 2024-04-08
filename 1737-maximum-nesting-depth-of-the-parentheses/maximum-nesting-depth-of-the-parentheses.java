class Solution {
    public int maxDepth(String s) {
        Stack<Character>st=new Stack<>();
      
        int maxCount=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push('(');
                count++;
                 maxCount=Math.max(maxCount,count);

            }
            else if(c==')'){
                st.pop();
                if(st.size()==0)
                count=0;
                else
                count--;
            }
           
            
        }
     
        return maxCount;
    }
}