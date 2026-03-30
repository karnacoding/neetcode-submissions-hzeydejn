class Solution {
    public int lengthOfLongestSubstring(String s) {

       int maxLength = 0;
       int start = 0;
       Set<Character> charSet = new HashSet<>();

       for(int end=0;end<s.length();end++){
            char current = s.charAt(end);

            while(charSet.contains(current)){
                charSet.remove(s.charAt(start));
                start++;
            }

            charSet.add(current);
            maxLength = Math.max(maxLength,end-start+1);
       }

       return maxLength;
        
    }
}