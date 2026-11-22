import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
       String input = s;
       input = s.replaceAll("[^a-zA-Z0-9]", "");
        
       input = input.toLowerCase();

       int start =0,end = input.length()-1;
       for(int i = 0 ; i < input.length(); i ++){
        if (input.charAt(start)==input.charAt(end)){
            start++;end--;
        }else{
            return false ; 
           
        }
       } return true ; 
    }
}