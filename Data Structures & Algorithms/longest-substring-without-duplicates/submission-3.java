class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashMap<Character,Integer>map = new HashMap<>();
      if(s.length()<=1) return s.length();
      int j = 0;
      int Length = Integer.MIN_VALUE;
      for(int i = 0;i<s.length();i++){
        char ch = s.charAt(i);
        if(map.containsKey(ch)){
           j = Math.max(j,map.get(ch)+1);
        }
        
            map.put(ch,i);
            Length = Math.max(Length,i-j+1);
        
      } 
      return Length; 
    }
}
