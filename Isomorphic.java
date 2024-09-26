//Time complexity : O(n)
//Space complexity: O(n)
//Compiled on leetcode.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int i=0;
        HashMap<Character, Character> map1 = new HashMap<>();	//Data stored in two hashmaps and for every character on split of string is stored.
        HashMap<Character, Character> map2 = new HashMap<>();
        while(i<s.length())
        {
            if(!map1.containsKey(t.charAt(i)))
                map1.put(t.charAt(i),s.charAt(i));
            if(!map2.containsKey(s.charAt(i)))						//TO check viceversa using 2 hashmaps.
                map2.put(s.charAt(i),t.charAt(i));
            if(!(map1.get(t.charAt(i))==s.charAt(i) && map2.get(s.charAt(i))==t.charAt(i)))
                    return false;
            i++;
        }
        return true;
    }
}