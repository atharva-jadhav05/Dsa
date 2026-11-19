import java.util.Arrays;
class Solution {
    public int findKthLargest(int[] nums, int k) {

       PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        int done = 0;
       for(int i = 0 ; i < nums.length ; i++){
        int num = nums[i];
        pq.add(num);
       }

        for(int i = 0 ; i < k ;i++){

            if(i==(k-1)){
                done = pq.poll();
                break;
            }
            pq.poll();
        }
        
    return done;
}
}