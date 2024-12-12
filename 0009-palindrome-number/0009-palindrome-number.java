class Solution {
    public boolean isPalindrome(int x) {
        int copy=x;
        if(copy<0){
            return false;
        }
        int rev=0,rem;
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(copy==rev){
            return true;
        }
        return false;
    }
}