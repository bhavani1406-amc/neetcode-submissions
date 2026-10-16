class Solution {
    public int characterReplacement(String s, int k) {
        int [] count = new int[26];
        int j = 0,freq = 0,length = 0;
        for(int i = 0;i<s.length();i++){
            int currchar = s.charAt(i)-'A';
            count[currchar]++;
            freq = Math.max(freq,count[currchar]);
            while((i-j+1)-freq>k){
                count[s.charAt(j)-'A']--;
                j++;
            }
            length = Math.max(length,i-j+1);
        }
        return length;
    }
}
