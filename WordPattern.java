//Time - O(n) - n -> pattern length
//Space - O(n) - n -> number of words in str
class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        /*Steps :
        1. If pattern length not equal to string length, return false
        2. result is a map of char, word and support is a set of word
        3. for each word, get the corresponding char at the pattern
        4. if that char is in the map, check whetther its value and current word are same, if not return false
        5. else, check if the current word is already mapped to some other pattern, if not add the pattern and word           into map*/
        
        String[] words = str.split(" ");
        if(pattern.length() != words.length)
        {
            return false;
        }
        HashMap<Character, String> result = new HashMap<Character, String>();
        HashSet<String> support = new HashSet<String>();
        for(int i = 0; i < words.length; i++)
        {
            char ch = pattern.charAt(i);
            if(result.containsKey(ch))
            {
                if(!result.get(ch).equals(words[i]))
                {
                    return false;
                }
            }
            else
            {
                if(support.contains(words[i]))
                {
                    return false;
                }
                result.put(ch, words[i]);
                support.add(words[i]);
            }
        }
        return true;
    }
}
