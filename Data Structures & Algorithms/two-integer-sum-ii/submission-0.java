class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans [] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int requried = target-nums[i];
            if(map.containsKey(requried)){
                ans[0] = map.get(requried)+1;
                ans[1] = i+1;
                return ans;
            }
            else map.put(nums[i],i);
        }
        return new int[0];
    }
}
