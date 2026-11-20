class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] left = new int [nums.length];
        int [] right = new int [nums.length];

        int ans[]=new int[nums.length];

       left[0]=1;
       for (int i = 1 ; i < nums.length ; i++){

        left[i]= left[i-1] * nums[i-1];
        // 1, 1x1=1 (this is left i-1 for next iter), 1x2=2 (this is left i-1 for next iter) , 2x3=6
       }

       right[nums.length-1] = 1;
       for(int i = nums.length-2 ; i >=0 ; i--){
        right[i]=right[i+1]*nums[i+1];
        //   2x12=24    ,  3x4=12     ,   4x1=4   ,1
       }

    for(int i = 0 ; i < nums.length ; i++){
        ans[i] = left[i]*right[i];
    }
    return ans;
}
}