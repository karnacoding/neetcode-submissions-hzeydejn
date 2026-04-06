class Solution {
    public boolean validPalindrome(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(str[left] == str[right]){
                left++;
                right--;
            }else{
                return isPalindrome(str,left+1,right) || isPalindrome(str,left,right-1);
            }
        }

        return true;
    }

    private boolean isPalindrome(char[] str, int left, int right) {
        while (left < right) {
            if (str[left] != str[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}