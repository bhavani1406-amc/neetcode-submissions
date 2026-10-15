class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1) return nums.length;
      Arrays.sort(nums);
      int count = 1,ans = 1;
      Stack<Integer>st = new Stack<>();
      st.add(nums[0]);
      for(int i = 1;i<nums.length;i++){;
        if(st.peek()==nums[i]-1 ) count+=1;
        else if(st.peek()==nums[i]) continue;
        else count = 1;
        st.add(nums[i]);
        ans = Math.max(count,ans);
      }
      return ans;
    }
}
