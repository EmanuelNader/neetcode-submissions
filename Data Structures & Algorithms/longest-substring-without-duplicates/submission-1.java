class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, maxLength = 0;
        HashMap<Character, Integer> window = new HashMap<>();

        for (int right = 0; right < s.length(); right++){
            char current = s.charAt(right);

            while (window.containsKey(current)){
                window.remove(s.charAt(left));
                left++;
            }
            window.put(current, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
