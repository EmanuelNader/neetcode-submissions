class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char[] StrS = s.toCharArray();
        char[] StrT = t.toCharArray();

        Arrays.sort(StrS);
        Arrays.sort(StrT);

        for (int i = 0; i < s.length(); i++){
            if (StrS[i] != StrT[i]){
                return false;
            }
        }
        return true;
    }
}
