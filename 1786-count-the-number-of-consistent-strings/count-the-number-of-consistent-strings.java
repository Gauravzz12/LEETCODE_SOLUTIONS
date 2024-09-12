class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans=0;
        for(int i=0;i<words.length;i++){
            int count=0;
            String s=words[i];
            for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                if(allowed.indexOf(c)!=-1){
                    count=1;
                }
                else{
                    count=0;
                    break;
                }
            }
            ans+=count;
        }
        return ans;
    }
}