// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Your code here along with comments explaining your approach
//We first sort a sring so as to generate a unique key for our HashMap...any anagram we sort will give us this key thus we keep adding every such instance to the value pair which will be a list
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0)
            return new ArrayList();
        HashMap<String,List> hm= new HashMap();
        for(String s:strs)
        {
            char[]ca=s.toCharArray();
            Arrays.sort(ca);
            String ins=String.valueOf(ca);
            if(!hm.containsKey(ins))
                hm.put(ins,new ArrayList());
            hm.get(ins).add(s);
        }
        
        return new ArrayList(hm.values());
    }
}
---------------------------------------------------------------------------------

// Time Complexity :O(n)
// Space Complexity :O(1)
// Your code here along with comments explaining your approach	
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() <= 1) return true;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                 if(map.get(a).equals(b))
                continue;
                else
                return false;
            }else{
                if(!map.containsValue(b))
                map.put(a,b);
                else return false;
                
            }
        }
        return true;
        
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------
// Time Complexity :O(n)
// Space Complexity :O(1)
// Your code here along with comments explaining your approach	
//We Create a map of The expected value for a given letter and every time we see that letter we make sure that the appropriate string is present 
class Solution {
    public boolean wordPattern(String pattern, String str) {
      if(pattern==null||str==null)  
          return false;
     String [] words=str.split(" ");
        if(pattern.length()!=words.length)
            return false;
      HashMap<Character,String> hm= new HashMap();
        for(int i=0;i<pattern.length();i++)
        {
            char p=pattern.charAt(i);
            String w=words[i];
            if(!hm.containsKey(p))
            {
                if(hm.containsValue(w))
                {
                    return false;
                }
                hm.put(p,w);
            }
            
            else
            {
                if(!hm.get(p).equals(words[i]))
                {
                   return false;   
                }
            }
        }
        return true;
    }
}