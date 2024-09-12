// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : none

class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character,String> map = new HashMap<>();
        String[] set = s.split(" ");
        if(set.length != pattern.length()) return false;

        for(int i=0 ; i<pattern.length() ; i++){

            if(!map.containsKey(pattern.charAt(i))) {

                if(map.containsValue(set[i])) return false;

                map.put(pattern.charAt(i),set[i]);
            }

            else
            {
                if(map.get(pattern.charAt(i)).equals(set[i]) == false) return false;;
            }
        }

        return true;
    }

}
