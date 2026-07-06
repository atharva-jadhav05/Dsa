class Solution {
    public boolean isPalindrome(int x) {
        int count = 0 ;
        int temp1 = x ; 
        boolean isPalindrome=true;
        int start = 0 ;

        if (x<0){return false;}
        while (temp1>0){
            count++;
            temp1= temp1/10;
        }

        int arr [ ] = new int [count];
        int end = arr.length-1;

        for (int i =0 ; i<count;i++){
            int temp = x%10;
            arr[i]=temp;
            x = x/10 ;
        }
        
        
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[start]==arr[end]){
                start ++; end --;
                isPalindrome= true ; 
            }else{
                isPalindrome = false ;
                break;
            }
        }
        return isPalindrome ; 
    }
}