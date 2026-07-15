class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length-1;
        int left = 0;
        int sum ; 
        for (int i =  0 ; i < numbers.length ; i++){
            sum = numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1, right+1};
            }
            else if (sum>target){
                right--;
            }
            else if (sum<target){
                left++;
            }
        }
        return new int[]{left+1, right+1};

    }
}