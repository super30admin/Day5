// 290. Word Pattern - https://leetcode.com/problems/word-pattern/
// Space Complexity - O(1)
// Time Complexity - O(1)

class Solution{
    public boolean wordPattern(String pattern, String s) 
    {
	String[] words = s.split(" ");
	
    //Return false if the pattern and amount of words are different lengths
	if(words.length != pattern.length())
    {
		return false;
	}

	HashMap<Character, String> map = new HashMap<Character, String>();
	for(int i = 0; i < pattern.length(); i++)
    {
		char c = pattern.charAt(i);
		if(map.containsKey(c))
        {
            //Return false if the map contains the key but has a differing value already assigned
			if(!map.get(c).equals(words[i]))
            {
				return false;
		    }
		}
		
        //Return false if the value is already in the map, but the key is not
		else if(map.containsValue(words[i]))
        {
			return false;
		}
		
        //Add the key value pair to the map if the key and value are not already in it
		else
        {
			map.put(c, words[i]);
		}
	}
	return true;
    }
}