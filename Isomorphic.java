import java.util.HashMap;

// Time Complexity :O(n)
// Space Complexity :O(n) + O(n)=> O(n) -- For two Hashmap.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nothing
class Isomorphic {
    public  boolean isIsomorphic(String s, String t) {
        
        // use two hashmap: 1 for key to value and 2 for value to key . 
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character> dict = new HashMap<>();
        HashMap<Character,Character> revDict = new HashMap<>();
        for(int i = 0 ;i <s.length();i++)
        {
            if(dict.containsKey(s.charAt(i)))
            {
                if(t.charAt(i)!=dict.get(s.charAt(i)))
                    return false;
            }
            else{
                if(!revDict.containsKey(t.charAt(i)))
                {
                    dict.put(s.charAt(i),t.charAt(i));
                    revDict.put(t.charAt(i),s.charAt(i));
                }
                else{
                    return false;
                }
            }
        }
        return true; 
    }
    public static void  main(String[] args)
    {
        System.out.println(new Isomorphic().isIsomorphic("paper", "title"));
        System.out.println(new Isomorphic().isIsomorphic("foo", "bar"));
        System.out.println(new Isomorphic().isIsomorphic("egg", "add"));
    }
}