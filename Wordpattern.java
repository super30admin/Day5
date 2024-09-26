// Time Complexity :0(n) no of characters in the s or t
// Space Complexity : 0(mn) 
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


class Solution {
    public boolean wordPattern(String pattern, String s) {
      //  if(s.length() != pattern.length()) return false;

        HashMap<Character,String> sMap = new HashMap<>();
        HashSet<String> tSet = new HashSet<>();
        
        String[] strArr = s.split(" ");
        
        if(strArr.length != pattern.length()) return false;

        for(int i=0;i<strArr.length;i++){
            
            char pChar = pattern.charAt(i);
            
            if(sMap.containsKey(pChar)){
                System.out.print(sMap.get(pChar));
                System.out.println(strArr[i]);
                if(!sMap.get(pChar).equalsIgnoreCase(strArr[i])) return false;
            }
             else
             {
                    if(tSet.contains(strArr[i])) return false;
                    else{
                        sMap.put(pChar,strArr[i]);
                        tSet.add(strArr[i]);
                    }
             }
        }
        
        
        return true;
    }
}