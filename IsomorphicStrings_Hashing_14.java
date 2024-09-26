//LeetCode = Passed
// Time Complexity - O(n)
/*
Runtime: 38 ms, faster than 5.11% of Java online submissions for Isomorphic Strings.
Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Isomorphic Strings.
*/


class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        if(s.length()==t.length()){
        for(int i=0; i<s_arr.length; i++){
            if((!map.containsKey(s_arr[i]))&&(!map.containsValue(t_arr[i]))){
            map.put(s_arr[i],t_arr[i]);
            }
            else{
                if(map.containsValue(t_arr[i])) if(!map.containsKey(s_arr[i])) return false;
                if(t_arr[i]!=map.get(s_arr[i])) return false;
            }
        }
            return true;
    }
        else return false;       
    }
}