class Solution {
    public int[] productExceptSelf(int[] nums) {
       int product = nums[0];
       int [] pre = new int [nums.length]; 
       int [] suf = new int [nums.length];
       pre[0] = 1 ; suf[nums.length-1] = 1; 
       for(int i =1;i<nums.length;i++) {
            pre[i] = product;
            product *=nums[i];
       }
       product = nums[nums.length-1];
       for(int i = nums.length-2;i>=0;i--){
           suf[i] = product;
           product *=nums[i]; 
       }
    //    1 2 3
    //    1 1 2
    //    6 3 1
    //    6 3 2
    for(int i = 0;i<nums.length;i++){
        pre[i] *= suf[i];
    }
       return pre;
    }
}  
