// Time Complexity :O(stringlength)
// Space Complexity :O(stringlength)- Hashmap
// Did this code successfully run on Leetcode : Yes.
// Approach : Use a hashmap, assign the character in s as a key to a character in t. If the key already exsists and there is a discrepancy in the mapping, then return false.Discrepancy in the mapping is checked in both s and t at every point.(i.e, if t[i] already exsists as a value || s[i] already exsists as a string).


class PR2 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] sa=s.toCharArray();
        char[] ta=t.toCharArray();
        Map<Character,Character> hmap=new HashMap<Character,Character>();
        for(int i=0;i<sa.length;i++){
            if(hmap.containsKey(sa[i])){
                char c=hmap.get(sa[i]);
                if(c!=ta[i]){
                    return false;
                  }
            }
            else{
                if(hmap.containsValue(ta[i])) return false;
                hmap.put(sa[i],ta[i]);
            }
         }
           return true;
        }
     
    }