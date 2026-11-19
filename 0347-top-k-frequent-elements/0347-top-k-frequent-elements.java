class Solution {
    public int[] topKFrequent(int[] nums, int k) {


        HashMap<Integer , Integer> map = new HashMap<>();
        int answer[]= new int[k];


        // frequency map
        for(int i = 0 ; i < nums.length ; i++){
            int num = nums[i];
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
       
        //priority queue which sorts largest at the top , map.get so it sorts by count not the value , b-a makes it a highest first queue rather than a smallest first .
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));


        //dumps all the map keys in the queue , pq sorts it using the map.get so their values
        pq.addAll(map.keySet());
        
        //It runs a loop k amount of times , so the highest [top ] k values get removed from the queue and stored in the the array answers
        for(int i = 0 ; i < k ; i++){
            answer[i]=pq.poll();
            
        }
        
        return answer;
    }
}