class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int sum ;
        int answer[]=new int[2];
        for (int i=0 ; i < numbers.length ; i++ ){
           sum =  numbers[start]+numbers[end];
           if(sum==target){
            answer[0]=start+1;
            answer[1]=end+1;
            return answer;
           }
           else if (sum>target){
            end--;
           }
           else{
            start++;
           }
        }
        
        return answer;
    }
}














// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int right = numbers.length-1;
//         int left = 0;
//         int sum ; 
//         for (int i =  0 ; i < numbers.length ; i++){
//             sum = numbers[left]+numbers[right];
//             if(sum==target){
//                 return new int[]{left+1, right+1};
//             }
//             else if (sum>target){
//                 right--;
//             }
//             else if (sum<target){
//                 left++;
//             }
//         }
//         return new int[]{left+1, right+1};

//     }
// }