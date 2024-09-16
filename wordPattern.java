//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public boolean wordPattern(String pattern, String s) {
        //initialize an array for the strings and split them when spaces occur
        String[] sArray=s.split(" ");
        //checking if pattern length is not equal to array length
        if(pattern.length()!=sArray.length)
            return false;
        //initializing 2 hashmaps to map the pattern->string and string->pattern
        HashMap<Character, String> pHashMap=new HashMap<>();
        HashMap<String, Character> sHashMap=new HashMap<>();
        //iterating over the characters in the pattern
        for(int i=0;i<pattern.length();i++){
            char p=pattern.charAt(i);
            String str=sArray[i]; 
            //checking if pHashMap contains this character p
            if(pHashMap.containsKey(p)){
                //then compare with its value, if it not equal to the string return false
                if(!pHashMap.get(p).equals(str))
                    return false;
            }
            else{
                pHashMap.put(p,str);
            }
            //if the sHashMap already contains a string->character
            if(sHashMap.containsKey(str)){
                if(sHashMap.get(str)!= p){
                    return false;
                }
            }
            else
                //if that mapping doesnot exist, then add it to shashMap
                sHashMap.put(str,p);
        }
        return true;
    }
}