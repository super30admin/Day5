
// Time Complexity :O(n)
// Space Complexity :O(n) + O(n)=> O(n) -- For two Hashmap.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nothing
import java.util.HashMap;

class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] wordArray=str.split(" ");
        if(pattern.length()!=wordArray.length)
            return false;
        HashMap<Character,String> dict = new HashMap<>();
        HashMap<String,Character> revDict = new HashMap<>();
        for(int i = 0 ;i <pattern.length();i++)
        {
            if(dict.containsKey(pattern.charAt(i)))
            {
                if(wordArray[i].compareTo(dict.get(pattern.charAt(i)))!=0)
                {
                  return false;   
                }
            }
            else{
                if(!revDict.containsKey(wordArray[i]))
                {
                    dict.put(pattern.charAt(i),wordArray[i]);
                    revDict.put(wordArray[i],pattern.charAt(i));
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
        System.out.println(new WordPattern().wordPattern("abba", "dog cat cat dog"));
        System.out.println(new WordPattern().wordPattern("abba", "dog cat cat fish"));
        System.out.println(new WordPattern().wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(new WordPattern().wordPattern("abba", "dog dog dog dog"));
    }
}