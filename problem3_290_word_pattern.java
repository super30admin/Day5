import java.util.HashMap;

// Time Complexity :In general the space Complexity will be o(n) for this approach but since alphabets are only 26(constant) it is O(1)
// Space Complexity:since alphabets are only 26(constant) it is O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :
//No 

// Your code here along with comments explaining your approach
/*converting given string into character array and then splitting the string into words based the space inoder to mat each char to a word and then checking if the map contains the value returning false else returning true*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
     
        char[] charP=pattern.toCharArray();
        System.out.println(charP);
        String[] wordArray=s.split(" ");
        HashMap<Character,String> map=new HashMap<>();

        if(charP.length!=wordArray.length) return false;
        if(pattern==null && s==null ) return true;
        if(pattern==null || s==null) return false;
        for(int i=0;i<charP.length;i++){
            if(map.containsKey(charP[i])){
                if(!map.get(charP[i]).equals(wordArray[i])){
                    return false;
            }
        }
            else{
                if(map.containsValue(wordArray[i])) return false;
                map.put(charP[i],wordArray[i]);
            }
        }
        return true;

    }
}