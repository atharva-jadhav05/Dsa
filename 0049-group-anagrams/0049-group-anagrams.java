class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList<>();
        }
        HashMap <String,List<String>> map = new HashMap <>();


        

        for(int i = 0 ; i < strs.length ; i ++){

            int[] freq = new int[26];
            String word = strs[i];
            // making frequency array for current word
            for(int j = 0 ; j < word.length() ; j++){
                char c = word.charAt(j);
                freq[c-'a']++;
            }
            //convert freq array into a string
             StringBuilder s = new StringBuilder();
             for(int j = 0 ; j < 26 ; j++){
                int val = freq[j];
                s.append(val);
                s.append('#');
             }

             String key = s.toString();

             if(map.containsKey(key)){
                map.get(key).add(word);
             }
             else{
                 List<String> list = new ArrayList<>();
                 list.add(word);
                 map.put(key,list);
             }


        }

    return new ArrayList<>(map.values());
    }
}