class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();// priority queue to sort values by smallest to largest

        for( int i = 0 ; i < nums.length; i++){
            int n = nums[i];
            pq.add(n); // adding the values in pq


            if(pq.size()>k){ // if the pq gets 1 more value than the size of k it gets rid of the top element , and the top element is the smallest , so at the end the 3 largest elements remain 
                pq.poll();
            }
        }
        return pq.poll();//we present the smallest element in the pq which is the kth largest elelent as it only stored the k elements and all the smaller elements got exiled
    }
}


// first approach 

// import java.util.Arrays;
// class Solution {
//     public int findKthLargest(int[] nums, int k) {

//        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
//         int done = 0;
//        for(int i = 0 ; i < nums.length ; i++){
//         int num = nums[i];
//         pq.add(num);

//         if ( )
//        }

       
        
//     return done;
// }
// }