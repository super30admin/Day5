// Time Complexity :
  //walking over all chars in a string O(s)   s = length of a string.
  //search and adding to hashMap: O(1).
  //total: O(n)
// Space Complexity :
  // hashMap : O(n) n = number of unique chars in s and t.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
  //finding relation between indx and char mapping.
// Your code here along with comments explaining your approach
  //get mapping indx of each char in each string.
  //if both point to same indx, update to point to same new indx.
  //else if both point to diff indx, then return false.
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();

        for(int i = 0 ; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            int sindx = smap.getOrDefault(sChar, -1);
            int tindx = tmap.getOrDefault(tChar, -1);
            if(sindx == tindx){
                smap.put(sChar, i);
                tmap.put(tChar, i);
            }
            else
                return false;

        }
        return true;
    }
}
