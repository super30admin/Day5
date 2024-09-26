// Time Complexity : O(N) n is size of string.
// Space Complexity : O(N^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Approch: Created 2 hashmaps, in one hashmap key would be the characters in first string and values are the characters in the second string so keep on adding key,value pairs while traversing through the two strings, while adding will be checking if the key is already present if it is present checking if the value that is paired with the key is equal to the value we are adding now if yes then we continue if not then the string is not isomorphic so we return false. Same with hashmap2 but here keys are from second string and values are from first string.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h1 = new HashMap<Character,Character>(); 
        HashMap<Character,Character> h2 = new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++){
            if(h1.containsKey(s.charAt(i))){ //checking if the key is already present and the value we are adding is the same as previous one.
                if(t.charAt(i) != h1.get(s.charAt(i))){
                    return false;
                }
            }
            h1.put(s.charAt(i),t.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            if(h2.containsKey(t.charAt(i))){
                if(s.charAt(i) != h2.get(t.charAt(i))){
                    return false;
                }
            }
            h2.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}
