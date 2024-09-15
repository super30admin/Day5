//Group anagrams
// Time Complexity : O(nc) c- length of each string
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class Solution {



    public List<List<String>> groupAnagrams(String[] strs) {
 
 
        //create a hashmap to store the string and corresponding anagram list
        HashMap <String,List<String>> map = new HashMap<>();
 
 
        //iterate over the length of the string
        for(int i = 0; i < strs.length; i++){
 
 
            //converting each string to a character array to ease in sorting amongst the characters
            char[] c = strs[i].toCharArray();
 
 
            //Sort the characters in the array
            Arrays.sort(c);
 
 
 
            String sortedWord = String.valueOf(c);
 
 
            //look for the sorted char in the hashmap
            if(!map.containsKey(sortedWord)){
 
 
                //if not found, creae a new arraylist and put it in the hashmap
                map.put(sortedWord, new ArrayList<String>());
 
 
 
            }
 
 
            //if found, add the string to the corresponding sorted character array.
            map.get(sortedWord).add(strs[i]);
 
 
 
        }
 
 
        //return the list with the corresponding anagram words.
        return new ArrayList<List<String>>(map.values());
 
 
 
    }
 
 
 
 }

 //---------------------------------------------------------------------//

 //Isomorphic Strings
// Time Complexity : O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class Solution {
    public boolean isIsomorphic(String s, String t) {

        //edge case where the two input strings are not equal in length
        if(s.length() != t.length()) return false;

        //Creating a hashmap mapping each character
        HashMap<Character, Character> sMap = new HashMap<>();
       
        //hashset used to check the character availability
        HashSet<Character> set = new HashSet<>(); 

        //iterate over the length of string s
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            
            if(sMap.containsKey(sChar)){
                //return false if character of string s is not equal to string t
                if(sMap.get(sChar) != tChar) return false;
                
            } else {
                 
               if(set.contains(tChar)) return false;//return false if the character is already in the set
                set.add(tChar); // else add the character to the set
                sMap.put(sChar, tChar); // map the character in string s to character in string t
                    
            }
        }
        return true;
    }
}

//---------------------------------------------------------------------//

//Word Pattern
// Time Complexity : O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class Solution {

    public boolean wordPattern(String pattern, String str) {
 
        //splitting the string into individual words in a array
        String[] arr= str.split(" ");
 
        int n = arr.length;
 
        int k = pattern.length();
 
        if(n != k) return false; //return false if string word-array length isnt equal to pattern array length
 
        //initializing two hashmaps to map the charcter to the corresponding string and vice-versa
        HashMap <Character, String> pMap = new HashMap<Character, String>();
 
        HashMap <String, Character> sMap = new HashMap<String, Character>();
 
        //iterating over the length of the array
        for (int i = 0; i < n; i++){
 
            char a = pattern.charAt(i);
 
        
            if(!pMap.containsKey(a)){
 
                pMap.put(a,arr[i]);//put the character and the element of the array in the pattern-hashmap if the key doesnt exist
            } else {
 
                 if (!pMap.get(a).equals(arr[i])) return false;//return false if the element isnt equal to the character
 
            }
            
            if(!sMap.containsKey(arr[i])){
 
                sMap.put(arr[i],a);//put the array element and the corresponding character in the string-hashmap if the string index key isnt found
 
            } else {
 
                if (!sMap.get(arr[i]).equals(a)) return false;
 
            }
 
        }
 
        return true;
 
    }
 
 }