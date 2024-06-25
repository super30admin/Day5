//Time Complexity : O(n)
//Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length)
            return false;

        HashMap<Character, String> pMap = new HashMap<>();
        HashSet<String> sSet = new HashSet<>();

        for(int i=0; i < pattern.length(); i++) {
            Character pChar = pattern.charAt(i);

            if(pMap.containsKey(pChar)) {
                if(!pMap.get(pChar).equals(words[i]))
                    return false;
            }
            else {
                if(sSet.contains(words[i]))
                    return false;
                pMap.put(pChar, words[i]);
                sSet.add(words[i]);
            }
        }
        return true;
    }
}