/*
  Time complexity : O(n)
  Space complexity : O(n)
  Leetcode : Yes

 Did this code successfully run on Leetcode : YES
 Any problem you faced while coding this :No 

Approach:using two hashmaps 
 */
class
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> smap= new HashMap<>();

        HashMap<String, Character> hmap = new HashMap<>();

        String [] a = s.split(" ");
        if(pattern.length() != a.length)
            return false;
        for(int i=0;i<pattern.length();i++)
        {

            if(!smap.containsKey(pattern.charAt(i)))
            {
                  smap.put(pattern.charAt(i),a[i]);

            }
            else
            {
                  if(!smap.get(pattern.charAt(i)).equals(a[i]))
                  {
                      return false;
                  }
            }

            if(!hmap.containsKey(a[i]))
            {
                hmap.put(a[i],pattern.charAt(i));
            }
            else
            {
                if(hmap.get(a[i])!=pattern.charAt(i))
                    return false;
            }
        }
        return true;
    }
}
