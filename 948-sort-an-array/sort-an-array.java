class Solution {
    public int[] sortArray(int[] nums) {
        int length=nums.length;
        if(length<=1)
        return nums;
        int mid=length/2;
        int[] left=new int[mid];
        int[] right=new int[length-mid];
        for(int i=0;i<mid;i++){
            left[i]=nums[i];
        }
        for(int i=mid;i<length;i++){
            right[i-mid]=nums[i];
        }
        sortArray(left);
        sortArray(right);
        mergeSort(nums,left,right);
        return nums;
    }
   public void mergeSort(int[] nums,int[] left,int[] right){
        int l=left.length;
		int r=right.length;
		int i=0,j=0,k=0;
		while(i<l && j<r) {
			if(left[i]<=right[j]) {
				nums[k]=left[i];
				i++;
			}
			else {
				nums[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<l) {
			nums[k++]=left[i++];	
		}
		while(j<r) {
			nums[k++]=right[j++];
		}
    }
}