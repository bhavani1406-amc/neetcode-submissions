class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String, List<String>> map = new HashMap<>();
      for(int i = 0;i<strs.length;i++){
        String str = strs[i];
        char [] a = str.toCharArray();
        Arrays.sort(a);
        String sorted = new String(a);
        if(map.containsKey(sorted)){
          List<String> list = map.get(sorted);
          list.add(strs[i]);
          map.put(sorted,list);  
        }
        else{
          List<String> list = new ArrayList<>();
          list.add(strs[i]);
          map.put(sorted,list);  
        }
      } 
      List<List<String>> ans = new ArrayList<>();
      map.forEach((key, value) -> {
      ans.add(value);
      });
      return ans;
    }
}
