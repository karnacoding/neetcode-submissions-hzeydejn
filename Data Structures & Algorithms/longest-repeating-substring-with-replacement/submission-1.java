class Solution {
    public int characterReplacement(String s, int k) {
        int start =0;
        int maxLen =0;
        int maxFreqInWindow = 0;
        Map<Character,Integer> frequency = new HashMap<>();
        if(s.length()<0){
            return 0;
        }

        for(int end=0;end<s.length();end++){
            char c = s.charAt(end);
            frequency.put(c,frequency.getOrDefault(c,0)+1);
            maxFreqInWindow = Math.max(maxFreqInWindow,frequency.get(c));

            while((end-start+1) - maxFreqInWindow > k){
                char leftChar = s.charAt(start);
                frequency.put(leftChar,frequency.get(leftChar)-1);
                start++;
            }

            maxLen = Math.max(maxLen, end-start+1);
        }
        
        return maxLen;
    }
}
