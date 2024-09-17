//Time Complexity is O(N)
//Space Complexity is O(N)
//Able to submit the problem in leetcode
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else if(map.values().contains(t.charAt(i))){
                return false;
            }
            else{
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
