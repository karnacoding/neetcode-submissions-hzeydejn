class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(str);
        char[] stringArray = str.toCharArray();
        int begin = 0;
        int end = stringArray.length-1;
        while(begin < end){
            if(stringArray[begin] == stringArray[end]){
                begin++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
