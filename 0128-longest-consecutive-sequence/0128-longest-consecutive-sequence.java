class Solution {
    public int longestConsecutive(int[] nums) {
        
        // Edge case: If the array is empty, there is no sequence, so return 0.
        // (This also prevents the code from crashing later when looking for numbers).
        if(nums.length==0){
            return 0;
        }
        
        // We use a HashSet because it allows us to check if a number exists 
        // in O(1) constant time. It also automatically removes any duplicate numbers.
        HashSet<Integer> set = new HashSet<>();
        
        // Initialize our maximum sequence length to 1. 
        // (Since we already checked if the array is empty, the minimum length is 1).
        int maxlen=1;
        
        // Loop through the array and add every number into the HashSet.
        // Time Complexity: O(n) because HashSet.add() is O(1).
        for(int i = 0 ; i < nums.length;i++){
            set.add(nums[i]);
        }
        
        // Loop through every unique number in our HashSet.
        for(int num : set){
            
            // 'currentnum' is the number we are currently checking in our sequence.
            // 'len' keeps track of how long this specific consecutive sequence is.
            int currentnum=num;
            int len=1;
            
            // THE TRICK: We only want to start counting if 'num' is the 
            // BEGINNING of a sequence. 
            // If (num - 1) exists in the set, it means this number is in the middle 
            // of a sequence, so we skip it to save time (this keeps our code at O(n)).
            if(set.contains(num-1)){
                continue;
            }
            else{
                
                // If we reach here, 'num' is the start of a sequence.
                // We keep checking if the next consecutive number exists (currentnum + 1).
                while (set.contains(currentnum+1)){
                    currentnum++; // Move to the next number in the sequence.
                    len++;        // Increase the length of the current sequence.
                }

            }
            
            // After counting the sequence, check if this new length ('len') 
            // is bigger than our all-time record ('maxlen').
            // If it is, update the record.
            if(len>maxlen){
                maxlen=len;
            }
        }
        
        // Finally, return the longest sequence we found.
        return maxlen;
    }
}