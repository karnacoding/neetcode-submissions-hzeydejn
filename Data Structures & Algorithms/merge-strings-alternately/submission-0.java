class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l = 0;
        int r = word1.length()+word2.length();
        char[] merged = new char[r];
        int index = 0;

        while(l<r){
            if(form(word1,l,merged,index)){
                l++;
            }
            if(form(word2,l,merged,index)){
                l++;
            }         
            index++;
        }
        System.out.println(merged.length);
        return String.valueOf(merged);
    }

    public boolean form(String word,int index,char[] merged,int pos){
        if(pos < word.length()){
            merged[index] = word.charAt(pos);
            return true;
        }else{
            return false;
        }
    }

    
}