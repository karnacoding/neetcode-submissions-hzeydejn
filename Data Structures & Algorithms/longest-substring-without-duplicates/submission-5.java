class Solution {
    public int lengthOfLongestSubstring(String s) {

        char[] string = s.toCharArray();
        int start = 0;
        int second = start+1;
        int end = s.length() - 1;
        int maxSubstring = 0;
        Set<Character> charSet = new HashSet<>();

        if(s.length() == 1){
            return 1;
        }

        while(start<=end && second<=end){
            if(start == 0 && charSet.isEmpty()){
                maxSubstring = 1;
                charSet.add(string[start]);
            }
                
            if(string[start] != string[second] && !charSet.contains(string[second])){
                charSet.add(string[second]);
                if(second-start+1 > maxSubstring){
                    maxSubstring = second-start+1;
                }
                second++;
            }else if(string[start] == string[second] || charSet.contains(string[second])){
                start++;
                second = start+1;
                charSet.clear();
                if (start <= end) charSet.add(string[start]);
            }
        }
        return maxSubstring;
        
    }
}