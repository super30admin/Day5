class Solution {
    public boolean wordPattern(String pattern, String s) {
       Map<String,String>  map = new HashMap<String,String>();
       
        
        if(pattern == null || pattern.length() ==0) return false;
        if(s==null || s.length() ==0 ) return false;
        int patternLength = pattern.length();
        String arrS[] = s.split(" ");
        if(patternLength != arrS.length) return false;
        
        boolean isOK = true;
        for(int index = 0 ;index< patternLength;index++){
            String c = pattern.charAt(index)+"";
            if(map.containsKey(c)){
                if(!map.get(c).equals(arrS[index])){
                    isOK = false;
                    break;
                }
            }else{
                map.put(c,arrS[index]);
            }
            
        }
        if(!isOK)
            return isOK;
        
        Map<String,String> map2 = new HashMap<String,String>();
        for(int index = 0; index < arrS.length;index++){
            String c = arrS[index];
            if(map2.containsKey(c)){
                if(!map2.get(c).equals(pattern.charAt(index)+"")){
                    isOK = false;
                    break;
                }
            }else{
                map2.put(c,pattern.charAt(index)+"");
            }
        }
        return isOK;
    }
}
