class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr)
        set.add(i);
        int temp=k;
        for(int i=1;i<=arr[arr.length-1]+temp;i++){
            if(!set.contains(i)){
                if(k==1){
                    return i;
                }
                else{
                    k--;
                }
            }    
            
            System.out.println(i);
            System.out.println(k);

            
        }
        return arr[arr.length-1]+temp;
    }
    }



