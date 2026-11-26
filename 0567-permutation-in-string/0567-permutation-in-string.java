class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap <Character , Integer > target = new HashMap<>();// hashmap for s1
        HashMap <Character , Integer > window = new HashMap<>();//hashmap for s2

        if(s1.length()>s2.length()){
            return false;
        }
        // making a frequency map of s1 
        for(int i = 0 ; i < s1.length() ; i++){
            char ch = s1.charAt(i);
            if(target.containsKey(ch)){
                target.put(ch,target.get(ch)+1);
            }else{
                target.put(ch,1);
            }
        }

        // filling the first window before moving 
        for(int i = 0 ; i < s1.length() ; i++){
            char ch = s2.charAt(i);
            if(window.containsKey(ch)){
                window.put(ch,window.get(ch)+1);
            }else{
                window.put(ch,1);
            }
        }

        if(window.equals(target)){
            return true;
        }

        int left = 0;
        for(int i = s1.length(); i < s2.length() ; i++){

            char newc = s2.charAt(i);
            char oldc = s2.charAt(left);

            // adding the freq of new character 
            if(window.containsKey(newc)){
                window.put(newc,window.get(newc)+1);
            }else{
                window.put(newc,1);
            }

            // reducing the frequency of the character located at left by 1 ( we know it exist so not if condition )
            window.put(oldc,window.get(oldc)-1);
            if(window.get(oldc)==0){
                window.remove(oldc);
            }
            left++;
            //checking if all the frequencies match between the maps
            if(window.equals(target)){
            return true;
            }
        }
        
       return false;
    }
}