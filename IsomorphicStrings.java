// Your code here along with comments explaining your approach
// We create a hashmap to store the mapping of characters from string s to string t.
// We also create a hashset to store the characters of string t.
// We iterate over the characters of string s and check if the character is already present in the hashmap.
// If it is present, we check if the mapping is correct. If it is not correct, we return false.
// If the character is not present in the hashmap, we add the mapping to the hashmap and check if the character in string t is already present in the hashset.
// If it is present, we return false.
// If it is not present, we add the character to the hashset.
// If we reach the end of the loop, we return true.
// The time complexity is O(n) where n is the length of the input strings s and t.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for (int i=0; i<s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                Character p=map.get(s.charAt(i));
                if (p==t.charAt(i)){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                map.put(s.charAt(i),t.charAt(i));
                if(set.contains(t.charAt(i))){
                    return false;
                }
                else{
                    set.add(t.charAt(i));
                }

            }
        }
        return true;
    }
}