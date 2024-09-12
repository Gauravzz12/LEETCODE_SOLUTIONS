class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();

        if(numRows==0){
            return ans;
        }
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);

        for(int i=1;i<numRows;i++){
            List<Integer> prevRow=ans.get(i-1);
            List<Integer> curr=new ArrayList<>();
            curr.add(1);
            for(int j=1;j<i;j++){
                int sum=prevRow.get(j-1)+prevRow.get(j);
                curr.add(sum);
            }
            curr.add(1);
            ans.add(curr);
        }
        return ans;


    }
}