// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> map = new HashMap();
        String[] arr = str.split(" ");
        //Check the length of the string and string array
        if(pattern.length() == arr.length){
            for(int i = 0; i<pattern.length();i++){
                char ch = pattern.charAt(i);
                String s = arr[i];
                
                if(!map.containsKey(ch)){
                    if(map.containsValue(s)){
                        return false;
                    }
                    else{
                        map.put(ch,s);
                    }
                }
                else if(!(map.get(ch)).equals(s)){
                    return false;
                }
            }
            return true;       
        }
        else{
            return false;
        }
    }
}
