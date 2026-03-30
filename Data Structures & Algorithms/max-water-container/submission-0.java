class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length-1;
        int maxBar = Integer.MIN_VALUE;
        while(start<end){
            int distance = end-start;
            int capacity = Integer.MIN_VALUE;
            if(heights[start] > heights[end]){
                capacity = heights[end] * distance;
                if(capacity > maxBar){
                    maxBar = capacity;
                }
                end--;
            }else{
                capacity = heights[start] * distance;
                if(capacity > maxBar){
                    maxBar = capacity;
                }
                start++;
            }
        }
        return maxBar;
    }
}
