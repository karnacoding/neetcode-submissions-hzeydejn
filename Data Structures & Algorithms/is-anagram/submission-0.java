class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> inputCharCount= new HashMap<>();
        Map<Character,Integer> matchCharCount = new HashMap<>();

        for(Character c:s.toCharArray()){
            inputCharCount.put(c,inputCharCount.getOrDefault(c,0)+1);
        }

        for(Character c:t.toCharArray()){
            matchCharCount.put(c,matchCharCount.getOrDefault(c,0)+1);
        }

        if(inputCharCount.equals(matchCharCount)){
            return true;
        }else
            return false;
    }
}
