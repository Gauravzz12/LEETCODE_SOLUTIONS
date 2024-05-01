class Solution {
    public String reversePrefix(String word, char ch) {
        String ans="";
        String res="";
        int pos=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=ch){
                res+=word.charAt(i);
            }
            else{
                res+=word.charAt(i);
                pos=i;
                break;
            }
        }
        System.out.print(res);
        for(int i=pos;i>=0;i--){
            ans+=res.charAt(i);
        }
        for(int i=pos+1;i<word.length();i++){
            ans+=word.charAt(i);
        }

        return ans;
    }
}