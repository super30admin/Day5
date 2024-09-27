// Time Complexity : O(N) where N is the length of pattern
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Isomorphic
{
    public boolean isIsomorphic(String s, String t) {

      int len = s.length();

      if(len == 1) return true;

      HashSet<Character> taken = new HashSet<>();

      HashMap<Character,Character> map = new HashMap<>();

      int count = 0;

      while(count < len)
      {
        char ch_s = s.charAt(count);
        char ch_t = t.charAt(count);

        if(!map.containsKey(ch_s))
        {
          if(taken.contains(ch_t)) return false;

          map.put(ch_s, ch_t);
          taken.add(ch_t);
        }

        else if(map.get(ch_s) != ch_t) return false;

        count++;
      }
      return true;
    }
}
