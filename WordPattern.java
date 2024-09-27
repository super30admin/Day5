/*
  Time Complexity :- O(N)
  Space Complexity :- O(N)
  Approach :- Create 2 hashmaps for character mapping of S to T and T to S. Compare the characters     one by one in hashmap...and if the character has already mapped to a different character, return     false
*/



class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        
        String[] array = s.split(" ");
        
        if(pattern.length()!=array.length)
            return false;
        
        Map<Character,String> patternToS = new HashMap<>();
        Map<String,Character> sToPattern = new HashMap<>();
        
        for(int i=0;i<pattern.length();i++) {
            char ch = pattern.charAt(i);
            String str = array[i];
            // System.out.println(i);
            // System.out.println(ch+" -> "+str);
            
            if(patternToS.containsKey(ch)){
                if(!patternToS.get(ch).equals(str)){
                    // System.out.println(patternToS.get(ch)+" -> "+str);
                    return false;
                }
            }else
                patternToS.put(ch,str);
            
            if(sToPattern.containsKey(str)){
                if(sToPattern.get(str)!=ch){
                    // System.out.println(sToPattern.get(str)+" -> "+ch);
                    return false;
                }
            }else
                sToPattern.put(str,ch);
        }
        return true;
    }
}
