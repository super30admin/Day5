// Time Complexity :
//      n - length of either string
//      total time complexity will be O(n)
//
// Space Complexity :
//      wordPattern() - O(1)
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern.length() == 0 || str.length() == 0)
            return false;
        List<String> arr = Arrays.asList(str.split(" "));
        if(pattern.length() != arr.size())
            return false;
        HashMap<Character, String> hm1 = new HashMap<>();
        HashMap<String, Character> hm2 = new HashMap<>();
        for(int i=0;i<arr.size();i++)
        {
            if(!hm1.containsKey(pattern.charAt(i)))
            {
                hm1.put(pattern.charAt(i), arr.get(i));
            }
            else if(hm1.containsKey(pattern.charAt(i)))
            {
                String s = hm1.get(pattern.charAt(i));
                if(!s.equals(arr.get(i)))
                {
                    return false;
                }
            }
            
            if(!hm2.containsKey(arr.get(i)))
            {
                hm2.put(arr.get(i), pattern.charAt(i));
            }
            else if(hm2.containsKey(arr.get(i)))
            {
                char s1 = hm2.get(arr.get(i));
                if(s1 != (pattern.charAt(i)))
                {
                    return false;
                }
           }
        }
        return true;
    }
}