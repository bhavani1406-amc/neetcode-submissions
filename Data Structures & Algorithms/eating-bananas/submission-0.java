class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int low = 1;
      int high = Integer.MIN_VALUE;
      int ans = 0;
      for(int ele : piles){
         high = Math.max(high,ele);
         
      }
      ans = high;
      while(low<=high){
        int mid = low+(high-low)/2;
        long hours = 0;
        for(int ele: piles){
            hours +=(ele+mid-1)/mid;
        }
        if(hours<=h){
            ans = mid;
            high = mid-1;
        }
        else low = mid+1;
      }  
      return ans;
    }
}
