class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length != pattern.length()){
            return false;
        }
        for(int i = 0 ; i < pattern.length() ; i++){
            Character ch = pattern.charAt(i);
            String word = words[i];
            if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(word)){
                    return false;
                }
            }else{
                if(map2.containsKey(word)){
                    return false;
                }
                map1.put(ch,word);
                map2.put(word,ch);
            }
        }
        return true;
        
    }
}