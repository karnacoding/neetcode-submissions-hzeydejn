class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int maxlength = Integer.MAX_VALUE;
        for(String s:strs){
            maxlength = Math.min(maxlength,s.length());
        }

        int matched = maxlength;
        String cmpr = strs[0];
        for(int i=1;i<strs.length;i++){
            String curr = strs[i];
            int matching = 0;
            for(int j=0;j<maxlength;j++){
                if(curr.charAt(j) == cmpr.charAt(j)){
                    matching++;
                }else{
                    break;
                }
            }
            cmpr = curr;
            matched = Math.min(matched,matching);
        }

        return matched > 0 ? cmpr.substring(0,matched) : "";
    }
}