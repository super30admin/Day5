// Time Complexity :O(n)

// Space Complexity :O(n)

// Did this code successfully run on Leetcode :yes

// Any problem you faced while coding this :no

// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(t.length()!=s.length()) return false;
        HashMap<Character, Character> map1= new HashMap<>();
        HashMap<Character, Character> map2= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a =s.charAt(i);
            char b = t.charAt(i);
            if(map1.containsKey(a)){
                if(!map1.get(a).equals(b)) return false;
            }
            else{map1.put(a,b);}
            if(map2.containsKey(b)){if(!map2.get(b).equals(a))return false;}
            else{map2.put(b,a);}
        }
    return true;
    }
}