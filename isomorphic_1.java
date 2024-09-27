# Time complexity:O(n)
# Space complexity: 0(1)
# Did code run successfully on leetcode: yes
# Any problem you faced: No

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character>  stmap = new HashMap<>();
        HashMap<Character, Character>  tsmap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            Character s1, t1;
            s1 = s.charAt(i);
            t1 = t.charAt(i);

        if(!stmap.containsKey(s1)){
            stmap.put(s1,t1);
        }
        else{
            if(t1 != stmap.get(s1))
            return false;
        }


        if(!tsmap.containsKey(t1)){
            tsmap.put(t1,s1);
        }
        else{
            if(s1 != tsmap.get(t1))
            return false;
        }


    }
        return true;
    }
}