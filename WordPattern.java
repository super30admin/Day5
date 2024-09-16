//TC-O(n) string array size
//SC- O(n)
// Leetcode- Successfully run

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] str= s.split(" ");
        
        int len=pattern.length();
        
        if(len!=str.length) return false;
        HashMap<Character, String> sMap= new HashMap<>();
        HashMap<String, Character> tMap= new HashMap<>();
        
        
        
        int i=0;
        //System.out.println(str[2]);
        while(i<len){
            if(sMap.containsKey(pattern.charAt(i))){
                String temp1=sMap.get(pattern.charAt(i));
                String temp2=str[i];
                
                if(!(temp1.equals(temp2))){
                    return false;
                }
            }else{
                sMap.put(pattern.charAt(i),str[i]);
            }
            if(tMap.containsKey(str[i])){
                if(tMap.get(str[i])!=pattern.charAt(i)){
                    return false;
                }
            }else{
                tMap.put(str[i],pattern.charAt(i));
            }
            i++;
           
            
        }
        
        return true;
        
    }
}