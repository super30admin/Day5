//Time Complexity: O(n)
//Space Complexity: O(n)
//This solution checks if two strings s and t are isomorphic by ensuring a consistent one-to-one mapping between characters in s and t. 
//It uses a dictionary (sMap) to store the mapping from s characters to t characters, 
//and a set to track already mapped characters in t to prevent conflicts. 
//The solution iterates through the strings, verifies the mappings, 
//and returns true if valid, otherwise returns false.


public class Solution {
    public bool IsIsomorphic(string s, string t) {
        if(s == null || t==null) return false;
        if(s.Length == 0 || t.Length == 0) return false;

        //can use 2 Dictionaries, or 2 char[]
        Dictionary<char, char> sMap = new Dictionary<char, char>(); 
        HashSet<char> set = new HashSet<char>();

        for(int i = 0; i<s.Length; i++){
            char sChar = s[i];
            char tChar = t[i];

            if(sMap.ContainsKey(sChar)){
                if(sMap[sChar] != tChar){
                    return false;
                }
            }else{
                if(set.Contains(tChar)){
                    return false;
                }
                set.Add(tChar);
                sMap.Add(sChar, tChar);
            }
        }

        return true;
    }
}