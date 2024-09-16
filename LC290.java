// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        //split str into string array
        String[] stringArray = str.split(" ");
        
        //calculate respective lengths
        int pSize = pattern.length();
        int strSize = stringArray.length;
        
        //if lengths are not equal, return false as there cant be one to one mapping
        if(pSize != strSize){
            return false;
        }
        
        //create two separate hashmaps for char to string and string to char mapping
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        
        //start iterating over the pattern
        for(int i = 0; i < pSize; i++){
            char ch = pattern.charAt(i);
            
            //if map1 does not conatin, put the key and value
            if(!map1.containsKey(ch)){
                map1.put(ch, stringArray[i]);
            }
            //if the map already contains the key, we check if the previously mapped value to this key is equal or not to the current value. If not, we return false.
            else{
                if(!map1.get(ch).equals(stringArray[i])){
                    return false;
                }
            }
            
            //same steps as we did for map1, now repeat for the reverse mapping 
            if(!map2.containsKey(stringArray[i])){
                map2.put(stringArray[i], ch);
            }
            else{
                if(!map2.get(stringArray[i]).equals(ch)){
                    return false;
                }
            }
        }

        //if the loop exits in case of array out of bound without return false, we return true here.
        return true;
    }
}