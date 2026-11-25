class Solution {
    public void rotate(int[] nums, int k) {
        int rotate = k % nums.length;
        
        int initialStart = 0;
        int initialEnd = nums.length-1;

        //reverse the whole array
        while(initialStart<initialEnd){
            int temp = nums[initialStart];
            nums[initialStart]=nums[initialEnd];
            nums[initialEnd]=temp;
            initialStart++;
            initialEnd--;
        }// 7 6 5 4 3 2 1


    

        //reverse the first k elements
        int Kstart=0;
        int Kend=rotate-1;
        while(Kstart<Kend){
            int temp = nums[Kstart];
            nums[Kstart]=nums[Kend];
            nums[Kend]=temp;

            Kstart++;Kend--;
        }

        //reverse the elements after the first k elements

        int RemainingStart = rotate;
        int RemainingEnd =nums.length-1;
        while(RemainingStart<RemainingEnd){
            int temp = nums[RemainingStart];
            nums[RemainingStart]=nums[RemainingEnd];
            nums[RemainingEnd]=temp;
            RemainingEnd--;RemainingStart++;
        }
    }
}