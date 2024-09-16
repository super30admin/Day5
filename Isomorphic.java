//Time Complexity  O(N)
// Space complexity O(1)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 0 || t.length() == 0)
            return true;
        HashMap<Character, Character> map1 = new HashMap<Character, Character>();
        Set<Character> assignedValues = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!map1.containsKey(ch)) {
                if (assignedValues.contains(t.charAt(i)))
                    return false;
                assignedValues.add(t.charAt(i));
                map1.put(ch, t.charAt(i));
            } else {
                char target = map1.get(ch);
                if (target != t.charAt(i))
                    return false;
            }
        }
        return true;
    }
}