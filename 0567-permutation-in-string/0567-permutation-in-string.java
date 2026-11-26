class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int target[] = new int[26];
        int window[] = new int[26];

        if(s1.length()>s2.length()){
            return false;
         }
        // filling freq array of s1
         for (int i = 0 ; i < s1.length(); i++){
            char ch = s1.charAt(i);
            target[ch - 'a']++;
         }

        //filling the values of first window before moving 
        for(int i=0 ; i<s1.length();i++){
            char ch = s2.charAt(i);
            window[ch-'a']++;
        }
        // checking if the first window contains the permutation
        if(Arrays.equals(target,window)){
            return true;
        }
        //edge of the left side of window which is used to remove the old characters
        int left = 0 ;

        for(int i = s1.length(); i < s2.length() ; i++){
            char newc = s2.charAt(i);
            char oldc = s2.charAt(left);

            window[newc - 'a']++;//adding freq by 1 to the new character
            window[oldc - 'a']--;// reducing freq by 1 from the old char

            left++;

             if(Arrays.equals(target,window)){
             return true;
            }


        }

        return false;
    }
}

// first accepthed solution 

// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         HashMap <Character , Integer > target = new HashMap<>();// hashmap for s1
//         HashMap <Character , Integer > window = new HashMap<>();//hashmap for s2

//         if(s1.length()>s2.length()){
//             return false;
//         }
//         // making a frequency map of s1 
//         for(int i = 0 ; i < s1.length() ; i++){
//             char ch = s1.charAt(i);
//             if(target.containsKey(ch)){
//                 target.put(ch,target.get(ch)+1);
//             }else{
//                 target.put(ch,1);
//             }
//         }

//         // filling the first window before moving 
//         for(int i = 0 ; i < s1.length() ; i++){
//             char ch = s2.charAt(i);
//             if(window.containsKey(ch)){
//                 window.put(ch,window.get(ch)+1);
//             }else{
//                 window.put(ch,1);
//             }
//         }

//         if(window.equals(target)){
//             return true;
//         }
//         //represents the left edge of out sliding window
//         int left = 0;

//         // main loop for  sliding the window and comparing the maps and adding new and removing old chars from the window
//         for(int i = s1.length(); i < s2.length() ; i++){

//             char newc = s2.charAt(i);
//             char oldc = s2.charAt(left);

//             // adding the freq of new character 
//             if(window.containsKey(newc)){
//                 window.put(newc,window.get(newc)+1);
//             }else{
//                 window.put(newc,1);
//             }

//             // reducing the frequency of the character located at left by 1 ( we know it exist so not if condition )
//             window.put(oldc,window.get(oldc)-1);
//             if(window.get(oldc)==0){
//                 window.remove(oldc);
//             }
//             //Incrementing the left pointer so that in next iter it points to the left edge of the shifted window
//             left++;
//             //checking if all the frequencies match between the maps
//             if(window.equals(target)){
//             return true;
//             }
//         }
        
//        return false;
//     }
// }