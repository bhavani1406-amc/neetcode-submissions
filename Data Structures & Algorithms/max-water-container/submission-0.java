class Solution {
    public int maxArea(int[] heights) {
       int i = 0; int j = heights.length-1;
       int maxwater = Integer.MIN_VALUE;
       while(i<=j) {
            int width = j-i;
            int height = Math.min(heights[i],heights[j]);
            int area = width*height;
            maxwater = Math.max(maxwater,area);
            if(heights[i]<heights[j])i++;
            else j--;
       }
       return maxwater;
    }
}
