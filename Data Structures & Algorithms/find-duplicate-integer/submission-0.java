class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer>Set = new HashSet<>();
       for(int ele : nums){
        if(Set.contains(ele)) return ele;
        else Set.add(ele);
       } 
       return -1;
    }
}
