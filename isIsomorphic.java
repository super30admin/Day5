// Time Complexity :O(n)
// Space Complexity :O(1) amortized space complexity;since space required to store 26 alphabets is constant.
// Did this code successfully run on Leetcode :yes
/*Approach : here, we have taken two hashmap where all of the (key,value) pairs in one hashmap exactly
resembles all(value,key)pair in another following One-to-one correspondence fashion.
*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> smap=new HashMap<>();
         HashMap<Character,Character> tmap=new HashMap<>();
        if(s.length()!=t.length())
            return false;
        if(s.length()==0||t.length()==0)
            return false;
        for( int i=0;i<s.length();i++){
            char cs=s.charAt(i);
            char ct=t.charAt(i);
            if(smap.containsKey(cs)&& tmap.containsKey(ct))
            {
                if(smap.get(cs)==ct && tmap.get(ct)==cs)
                    continue;
                else
                    return false;
            }
            else if (!smap.containsKey(cs)&& !tmap.containsKey(ct)){
              smap.put(cs,ct);
                tmap.put(ct,cs);
            }
            else {
               return false;
            }

        }
        return true;
    }
}