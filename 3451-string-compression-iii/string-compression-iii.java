class Solution {
    public String compressedString(String word) {
        if (word == null || word.length() == 0) {
            return "";
        }
        
        StringBuilder ans = new StringBuilder();
        char cur = word.charAt(0);
        int count = 1;
        
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == cur && count < 9) {
                count++;
            } else {
                ans.append(count).append(cur);
                cur = word.charAt(i);
                count = 1;
            }
        }
        ans.append(count).append(cur); // Append the last group

        return ans.toString();
    }
}