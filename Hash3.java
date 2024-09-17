class Solution {
    public boolean wordPattern(String pattern, String str) {
         HashMap<Character,String> map = new HashMap<>();
         HashMap<String,Character> map2 = new HashMap<>();
        String []strArray = str.split(" ");
        if(strArray.length != pattern.length())
            return false;
        
        for(int i =0; i<pattern.length();i++){  
            char sc = pattern.charAt(i);
            String tc = strArray[i];
            if(!map.containsKey(sc))
            {
                map.put(sc,tc);
            }
            else{
                if(!(tc.equals(map.get(sc))))
                    return false;
            }
            
            
            
        if(!map2.containsKey(tc))
            {
                map2.put(tc,sc);
            }
            else{
                if(!(sc==(map2.get(tc))))
                    return false;
            }
       
        
        }
         return true;
    }
    }
