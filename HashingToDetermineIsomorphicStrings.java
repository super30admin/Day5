// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


//Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every character of str1 to every character of str2. 
//And all occurrences of every character in ‘str1’ map to same character in ‘str2’.
//The length of both the strings should be equal

//With single hashmap you can search key & value and check if its isomorphic.
//Search for key is O(1) as its getting the corresponding key calculating hashcode.So the time complexity os O(1)
//But search for value is O(N^2)

//With two hashmap approach we are trading space with time.We will be using additional space,but time complexity will reduce from O(N^2) to O(N)
//In first hash map, store the character from string 1 as key and its corresponding character mapping from str2 
//In Second hashmap, mirror it so that key value in hashmap is reveresed in haspmap 2
//Example : if mapping is "a" to "b" in hashmap1, it will be "b" to "a" in the hashmap2
//Now the step that checks value in hashmap1 can be skipped,instead check the key of hashmap2
//with that search for key and value will be O(1)

//Constraint says s & t can contain  any valid ascii character. Total ascii characters are 256


class HashingToDetermineIsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        
        //s='eggm', t='tooe'
        
        if(s == null || t==null ||s.length() != t.length())
            return false;
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            
            if(!sMap.containsKey(sChar) )
            {
                sMap.put(sChar, tChar);
            }
            if(!tMap.containsKey(tChar))
            {
                tMap.put(tChar, sChar);
            }
            if(sMap.get(sChar) != tChar || tMap.get(tChar) != sChar)
                return false;
        	}
        
        return true;
    }
}
