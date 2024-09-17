// Time Complexity :O(n)
// Space Complexity :O(n) - number of strings
// Did this code successfully run on Leetcode :yes 
// Any problem you faced while coding this :-

// Your code here along with comments explaining your approach
class Solution {
    public boolean wordPattern(String pattern, String str) {
        int i=0;
         String[] Strn = str.split(" ");
        Map<Character,String> map=new HashMap<>();
        if(Strn.length!=pattern.length())
            return false;
        for(i=0;i<pattern.length();i++)
        {
           
           if(map.containsKey(pattern.charAt(i)))
           {
               if(!map.get(pattern.charAt(i)).equals(Strn[i]))
                   return false;
           }else{
               if(map.containsValue(Strn[i]))
                   return false;
               map.put(pattern.charAt(i),Strn[i]);
           }
            
        }
        return true;
    }
}