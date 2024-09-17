// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public boolean isIsomorphic(String s, String t) {
       if (t.length() != s.length()) return false;
        HashMap<Character,Character> smap = new HashMap<>();
        HashSet<Character> tset = new HashSet<>();

        char[] scar= s.toCharArray();
        char[] tcar= t.toCharArray();

        for(int i = 0; i <= scar.length-1 ; i++){
            if(smap.containsKey(scar[i])){
                if(smap.get(scar[i]) != tcar[i]){
                    return false;
                }
            }
            else{
                smap.put(scar[i],tcar[i]);
                if(tset.contains(tcar[i])){
                    return false;
                }
                tset.add(tcar[i]);
            }
        }
        return true;
    }
} 