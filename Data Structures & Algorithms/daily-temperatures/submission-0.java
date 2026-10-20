class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int [] arr = new int[temperatures.length];
       for(int i = 0;i<arr.length;i++){
        int ele = temperatures[i];
        int count = 0;
        for(int j = i+1;j<arr.length;j++){
            if(ele>temperatures[j]) continue;
            if(ele<temperatures[j]) {
                count +=(j-i);
                break;
            }
        }
        arr[i] = count;
       } 
       return arr;
    }
}
