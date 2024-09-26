// Time: O(n)
// Space: O(n)

import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strArr = str.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        char[] pArr = pattern.toCharArray();
        if(pArr.length != strArr.length)
            return false;
        
        for(int i=0; i < pArr.length; i++)
        {
            if(map.containsKey(pArr[i]))
            {
                if(!map.get(pArr[i]).equals(strArr[i]))
                    return false;
            }
            else
            {
                if(map.containsValue(strArr[i]))
                    return false;
                map.put(pArr[i], strArr[i]);
            }
        }
        return true;
    }
}