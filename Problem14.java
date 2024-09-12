import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String str) {
       
        String[] arr= str.split(" ");
        HashMap<Character, String> map1 = new HashMap<Character, String>();
        if(arr.length!= pattern.length())
            return false;
        for(int i=0; i<arr.length; i++){
            char c = pattern.charAt(i);
            if(map1.containsKey(c)){
                if(!map1.get(c).equals(arr[i]))
                    return false;
            }else{
                if(map1.containsValue(arr[i]))
                    return false;
                map1.put(c, arr[i]);
            }    
        }
        return true;
    }
        
}
