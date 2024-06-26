class Solution {
    public int searchInsert(int[] arr, int x) {
        int low=0,high=arr.length-1;

        while(low<=high){

            int mid=(low+high)/2;

            if(arr[mid]==x)
            return mid;
            else if(arr[mid]>x)
            high=mid-1;
            else 
            low=mid+1;
    }
    return low;
}
}