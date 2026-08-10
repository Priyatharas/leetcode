class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            // Convert word into characters
            char[] arr = strs[i].toCharArray();

            // Sort characters
            Arrays.sort(arr);

            // Sorted characters = BOX NAME
            String key = new String(arr);

            // If BOX does not exist, create it
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Open BOX and add the word
            map.get(key).add(strs[i]);
        }

        // Return all BOX contents
        return new ArrayList<>(map.values());
    }
}