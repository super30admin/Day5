// Time Complexity :
  //walking over all chars/strings in either array  O(s)   s = length of a pattern.
  //search and adding to hashMap: O(1).
  //total: O(n)
// Space Complexity :
  // charMap hashMap : O(n) n = number of unique chars in pattern.
  // strMap hashMap : O(n) n = number of unique words in str.
  // total : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
  //finding relation between indx and char mapping.
// Your code here along with comments explaining your approach
  //get mapping indx of each char and word in each array.
  //if both point to same indx, update to point to same new indx.
  //else if both point to diff indx, then return false.
class Solution {
    public boolean wordPattern(String pattern, String str) {
        char chararr[] = pattern.toCharArray();
        String strarr[] = str.split(" ");

        if(chararr.length != strarr.length)
            return false;

        HashMap<Character, Integer> charMap = new HashMap<>();
        HashMap<String, Integer> strMap = new HashMap<>();

        for(int i = 0 ; i < chararr.length; i++){
            int charindx = charMap.getOrDefault(chararr[i], -1);
            int strindx = strMap.getOrDefault(strarr[i],-1);

            if(charindx != strindx)
                return false;
            else{
                charMap.put(chararr[i], i);
                strMap.put(strarr[i],i);
            }
        }
        return true;
    }
}
