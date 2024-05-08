class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans=new String[score.length];
        ArrayList<pair> res=new ArrayList<>();
        for(int i=0;i<score.length;i++){
            res.add(new pair(score[i],i+1));
        }   
        
        Collections.sort(res, (x, y) -> (y.a - x.a));
          for (pair p : res) {
            System.out.println("(" + p.a + ", " + p.b + ")");
        }
        for(int i=0;i<score.length;i++){
           if(i==0){
             ans[res.get(i).b-1]="Gold Medal";
           }
           else if(i==1){
             ans[res.get(i).b-1]="Silver Medal";
           }
           else if(i==2){
             ans[res.get(i).b-1]="Bronze Medal";
           }
           else{
             ans[res.get(i).b-1]=Integer.toString(i+1);
           }
        }
        return ans;
    }

    class pair{
        int a;
        int b;
        pair(int a,int b){
            this.a=a;
            this.b=b;
    }
    }
}