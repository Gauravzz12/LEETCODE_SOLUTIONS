class Solution {
            HashSet<Integer>set=new HashSet<>();

    public boolean isHappy(int n) {
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        System.out.print(sum);
        
        if(sum==1){
            return true;
        }
        else if(set.contains(sum)){
           return false;
        }
        else{
             set.add(sum);
        }
        
    return isHappy(sum);

    }
}