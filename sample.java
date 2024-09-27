//Problem-1
// Time Complexity : O(nslogs *s) where n is no of elements in the string array and s is the size of the string. s is multiplied as the strings are stored in hashmap using ascii value so to calculate the ascii value for whole string, each character is traversed so O(s) i.e avg length of string
// Space Complexity : O(ns) as n strings are stored of length s
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List> map = new HashMap<>(); // to store the sorted word as key and the strings that form the same sorted word as the values

        for(int i=0;i< strs.length; i++) // looping through the string array
        {
            char[] characters= strs[i].toCharArray(); // converting the current string to character array
            Arrays.sort(characters); // sorting the character array
            String key = String.valueOf(characters); // creating a string of the sorted character array to store as key
            if(!map.containsKey(key)) // if the map does not contain the key already
            {
                map.put(key, new ArrayList()); // put the key and initialze a new list
            }
                map.get(key).add(strs[i]); // get the value at key found and add the string to the list
        }
        
      return new ArrayList(map.values());  // return the list of the values
    }
}

//Problem-2
// Time Complexity : O(n) as need to iterate over the string array as well as the complexity for containsValue is O(n) since it checks all keys and their corresponding values.
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

class Solution {
    public boolean isIsomorphic(String s, String t) {
      HashMap<Character, Character> map = new HashMap<>(); // intialize a hashmap to store the corresponding characters from each string
        
        if(s.length() != t.length()) // if lengths don't match, they can't be isomorphic
            return false;
        
        for(int i = 0; i < s.length(); i++) // iterating through first string's length
        {
            char ch1 = s.charAt(i); // getting character from string s
            char ch2 = t.charAt(i); // getting character from string t
            
            if(!map.containsKey(ch1)) // if map does not contain the key
            {
                if(!map.containsValue(ch2)) // if map does not contain the value
               // the complexity for containsValue is O(n) since it checks all keys and their corresponding values.
                    map.put(ch1,ch2); // put key and value in the map
                else
                    return false; // if map contains the value at different key, returning false
                
            }
            else if(map.containsKey(ch1) && !(map.get(ch1)).equals(ch2))
                return false; // if the map contains the key but the incoming value is different for the key, return false
        }
        
        return true; // otherwise return true
    }
}


//Problem-3
// Time Complexity : O(n) 
// Space Complexity : O(n+n) = O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();// intialize a hashmap to store the corresponding string for each character
        String[] split = str.split(" "); // an array to store each word in the string str at seperate indices
        
        if(split.length != pattern.length()) // if lengths don't match, pattern can't match
            return false;
        
        for(int i=0;i<pattern.length();i++) 
        {    
            char ch = pattern.charAt(i);
            String word = split[i];
        
        if(!map.containsKey(ch)) // if map does not contain the key
        {
            if(!map.containsValue(word)) // if map does not contain the value
                map.put(ch, word);  // put key and value in the map
             else
                return false; // if map contains the value at different key, returning false
        }
            else if(map.containsKey(ch) && !(map.get(ch)).equals(word))  // if the map contains the key but the incoming value is different for the key, return false
                return false;
         
        }     
        
        return true; // otherwise return true
    }
}