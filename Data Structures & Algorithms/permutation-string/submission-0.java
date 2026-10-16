class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        
        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (arr1[i] == arr2[i]) count++;
        }

        int j = 0;
        for (int i = s1.length(); i < s2.length(); i++) {
            if (count == 26) return true;

            int rightch = s2.charAt(i) - 'a';
            int leftch = s2.charAt(j) - 'a';
            arr2[rightch]++;
            if (arr1[rightch] == arr2[rightch]) {
                count++;
            } else if (arr1[rightch] + 1 == arr2[rightch]) { 
                count--;
            }
             arr2[leftch]--;
            if (arr1[leftch] == arr2[leftch]) {
                count++;
            } else if (arr1[leftch] - 1 == arr2[leftch]) { 
                count--;
            }

            j++;
        }

        return count == 26;
    }
}