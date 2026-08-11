class Solution {
    public int firstUniqChar(String s) {

        // Step 1: Create 26 boxes for a-z
        int[] count = new int[26];

        // Step 2: Count each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Step 3: Find the first character whose count is 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // No unique character
        return -1;
    }
}