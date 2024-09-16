/*
Time Complexity -->
O(n)

Space Complexity -->
O(1) since only alphabets are added

Approach -->
1. Have a hasmap and a set
2. Whenver we encounter a new character push it to hasmap
3. if already existing in the map check if value of that key is similar to one in the t string
4. if not return False
5. once looped through every element return True
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        
        HashMap<Character, Character> smap = new HashMap<>();// mapping characters in s
        HashSet<Character> tset = new HashSet<>();// mapping characters in t
        for(int i=0;i<s.length();i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if(smap.containsKey(s1)){
                if(smap.get(s1)!=t1){
                    return false;
                }
                
            }//if
            else{
                if(tset.contains(t1)){
                    return false;
                }
                else{
                    smap.put(s1, t1);
                    tset.add(t1);
                }
            }
            
        }//for
        //System.out.println(smap);
        //System.out.println(tset);
        return true;
        
        
    }
}