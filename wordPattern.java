// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


public boolean wordPattern(String pattern, String s) {
    //similar to isomorphic concept
    String[] wordString = s.split(" "); // converting the word string into string array
    if(pattern.length() != wordString.length){ // if the length doesn't matches then return false
        return false;
    }
    //hashMap + HashSet for secondary string
    HashMap<Character,String> map = new HashMap<>();
    HashSet<String> set = new HashSet<>();
    
    for(int idx =0;idx<pattern.length();idx++){ //iterating 
        char pChar = pattern.charAt(idx);
        String word = wordString[idx];
        if(map.containsKey(pChar)){ // if the map caontains this character
            if(!word.equals(map.get(pChar))){ // if the corresponding word is not qual to the word in the second string
                return false;
            }
        }else{ // if the map doesn't contains the character
            if(set.contains(word)){ // if the word in secondary string is already mapped
                return false;
            }
            map.put(pChar,word); // if all okay then add it to the map and set
            set.add(word);
        }
    }
    return true;
}