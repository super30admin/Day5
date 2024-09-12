// Time Complexity :O(n)
// Space Complexity :O(n) where n is the length of String pattern and String s (because a new array will be created for storing String s as array of Strings)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : I am confused on the space complexity, because in the isomorphic problem, we said
                                            // that space complexity will be O(1), because hashMaps stores unique characters (which are constant)
                                            // But here in the second hashMap, we will store Strings as key (But still it will be for
                                            // each Character in the HashMap1 .... please correct me here)
                                            // But majorly, storing the String in array will make it O(1) I think
                                            // Please tell me, If I can do it O(1) space complexity, If my solution is O(n)


// Your code here along with comments explaining your approach
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        //convert the string into string of Array
        String[] str = s.split(" ");
        //if length of the pattern and str are not same return false
        if(pattern.length() != str.length) return false;
        
        //HashMap to store mappings pattern --> str
        HashMap<Character, String> pMap = new HashMap<>();
        //HashMap to store mappings str --> pattern
        HashMap<String, Character> sMap = new HashMap<>();
        
        //iterate over the pattern (or str, as both are same length)
        for(int i=0; i<pattern.length(); i++){
            //Charater in string pattern at index i
            Character pChar = pattern.charAt(i);
            //String in array str at index i
            String sString = str[i];
            //if pMap contains the character in string pattern at index i
            if(pMap.containsKey(pChar)){
            //But if it is not equal to the String in str at index i, return false
                if(!pMap.get(pChar).equals(sString)) return false; 
            }
            else{
               //if pMap doesn't contains the character in string pattern at index i
               // add that key value pair
                pMap.put(pChar, sString);
            }
            //if sMap contains the String in String array str at index i
            if(sMap.containsKey(sString)){
            //But if it is not equal to the Character in String pattern at index i, return false
                if(!sMap.get(sString).equals(pChar)) return false;
            }
            else{
                //if sMap doesn't contains the String in String array str at index i
               // add that key value pair
                sMap.put(sString, pChar);
            }
        }
        //return true
        return true;
    }
}