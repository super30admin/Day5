

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        HashMap<Character , String> map= new HashMap();
        if(words.length != pattern.length()) // checking the length of words array to pattern String
            return false;
        for (int i =0; i< pattern.length(); i++)
        {
            char current= pattern.charAt(i); 
            if(map.containsKey(current))
            { // we are checking if map contains the character as a key if it does it should be equal to it's corresponding word  
                if(!map.get(current).equals(words[i]))
                {
                    return false;
                }
            }
                else
                {// here we are checking if map does not have the key but the word is present
                    if(map.containsValue(words[i]))
                    {
                        return false;
                    }
                    map.put(current , words[i]);
                }
            
        }
        return true;
    }
}

Time complexity : O(N) where N represents the number of words in str or the number of characters in pattern.

Space complexity :O(N) where N represents the number of unique words in str.