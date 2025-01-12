//If m = length of pattern and n = length of s, and k = avg length of word after splitting
//Time Complexity: O(nk) 
//Space Complexity: O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :NO

// Your code here along with comments explaining your approach
class Solution {
    public boolean wordPattern(String pattern, String s) {

        
        String[] pat = s.split(" ");
        HashMap<Character, String> m2 = new HashMap<>();
        HashMap<String, Character> m1 = new HashMap<>();
        //System.out.println(pat.length);
        if(pattern.length() != pat.length) return false;
        for(int i = 0; i < pattern.length(); i++){
            
            Character c = pattern.charAt(i);
            
            if(!m2.containsKey(c)){
                m2.put(c,pat[i]);
            }else{
                if(!m2.get(c).equals(pat[i])){
                    System.out.println(m2.get(c) +" " + pat[i]);
                    return false;
                }
            }

            if(!m1.containsKey(pat[i])){
                m1.put(pat[i], c);
            }else{
                if(!m1.get(pat[i]).equals(c)){
                    return false;
                }
            }


        }

        return true;




    }
}