//approach1 - Two Hashmap
//Time - O(n) - look up time for strings
//Space - O(1) - character at most are 100 so, even taking 2 hashmap will just make it constant only. 

import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s == null || t == null) return true;
        if(s.length() != t.length()) return false;
        
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
           
            //check if values exist
            if(sMap.containsKey(schar))
            {
               //check if tmap also has the same mapping, keep going
               if(tchar != sMap.get(schar))return false;
            }
            else if(!tMap.containsKey(tchar))
            {
               //put values into Hashmaps
               sMap.put(schar, tchar);
               tMap.put(tchar, schar);
             }
             else
             {
                 return false;
             }      
        }
        
        return true;
    }
}

//Approach - one Hashmap

//approach - value lookup time is greater than approach 1. 
// time- O(n)
//space - O(1)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        if(s == null || t == null) return true;
        
        HashMap<Character, Character> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i)) != t.charAt(i))
                {
                    return false;
                }
            }
            else{
                if(map.containsValue(t.charAt(i)))
                    return false;
                else
                    map.put(s.charAt(i) , t.charAt(i));
            }
        }
        return true;
    }
}


//approach 3: get two arrays for individual strings. 
// for the sarray' sschar's index, put tchar value nd same way for tarray/ 
// now just like Hashmap, do lookup, here lookup will be easy compared to Hashmap as we dont do hashing and all.
//TIme - O(n) - to traverse through string characters. 
//Space - O(1)
//Jut a note --  We always cosider Hashmap lookup time (hashing functions) as O(1)!

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        if(s == null || t == null) return true;
        
        char[] sa = new char[100];
        char[] ta = new char[100];
        
        for(int i =0; i < s.length(); i++)
        {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            
            //cehck for sarray
            if(sa[schar- ' ']!= 0)
            {
                //check if it's tmap
                if(sa[schar- ' '] != tchar) return false;
            }
            else 
            {
                sa[schar - ' '] = tchar;
            }
            //check for tarray
            if(ta[tchar - ' '] != 0)
            {
                if(ta[tchar - ' '] != schar) return false;
            }
            else
            {
                ta[tchar -' '] = schar;
            }
        }
        return true;
    }
}



//approach -4 
//use hashmap to out key value pairs
//if key exist, get the value and check if it's there in set, if not return false. 
//if key dont exist, put key-val pair and check if set contains val--if so return false else put val in set. 


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        if(s == null || t == null) return true;
        
        HashMap<Character, Character> map = new HashMap<>();
		HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<s.length(); i++)
        {
			char key = s.charAt(i); 
			char val = t.charAt(i);
            if(map.containsKey(key))
            {
				//check if same value exists in set
                if(map.get(key) != val )
				{
					return false;
				}
            }
            else{
                 //check if set already has the value for different key!
				 if(set.contains(val)) return false;
				 
                 map.put(key , val);
				 set.add(val)
            }
        }
        return true;
    }
}