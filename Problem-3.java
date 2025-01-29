// This solution also follows the same process as problem-2 but here values are strings instead of characters

class Solution {
    public boolean wordPattern(String pattern, String s) {
        java.util.HashMap<Character, String> pToSMap = new java.util.HashMap<>();
        java.util.HashSet<String> valueSet = new java.util.HashSet<>();
        String[] words = s.split("\\s+");
        if (pattern.length() != words.length)
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            String currWord = words[i];
            char currKey = pattern.charAt(i);
            if (pToSMap.containsKey(currKey)) {

                if (!valueSet.contains(currWord))
                    return false;
                if (!pToSMap.get(currKey).equals(currWord)) {
                    return false;
                }
            } else {
                if (valueSet.contains(currWord))
                    return false;
                pToSMap.put(currKey, currWord);
                valueSet.add(currWord);
            }
        }
        return true;
    }
}