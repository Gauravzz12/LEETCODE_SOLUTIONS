class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        
        Arrays.sort(happiness);
        long sum=0;
        int temp=k;
        for(int i=happiness.length-k;i<=happiness.length-1;i++){
            if(i==happiness.length-1)
            sum+=(long)happiness[i];
            else{
                if(happiness[i]>(temp-1))
                 sum=sum+(long)(happiness[i]-temp+1);
                temp--;
            }

        }

        return sum;
    }
}
