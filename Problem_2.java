// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :mapping the the midpoint element to matrix.


// Your code here along with comments explaining your approach


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> hash=new HashMap<Character,Character>();
        HashSet<Character> set=new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i))){
                if(t.charAt(i)!=hash.get(s.charAt(i))){
                    return false;
                }
            }else{
                if(set.contains(t.charAt(i))){
                    return false;
                }
                hash.put(s.charAt(i),t.charAt(i));
                set.add(t.charAt(i));
            }
        }

        return true;
    }
}