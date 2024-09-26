// Time Complexity: O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this: No

public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        
        if(arr.length!= pattern.length())
            return false;

        String[] arr= str.split(" ");
        HashMap<Character, String> map = new HashMap<Character, String>();

        for(int i=0; i<arr.length; i++){
            char c = pattern.charAt(i);

            if(map.containsKey(c)){
                if(!map.get(c).equals(arr[i]))
                    return false;
            }else{
                if(map.containsValue(arr[i]))
                    return false;
                map.put(c, arr[i]);
            } 

        }

        return true;
    }
}