//Time Complexity : O(n)
//Space complexity : O(1)
//Did it run in leetcode : yes
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray = s.split(" ");
        if(pattern.length()!=strArray.length){
            return false;
        }
        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> smap = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String str = strArray[i];
            if(patternMap.containsKey(ch)){
                if(!str.equals(patternMap.get(ch))){
                    return false;
                }
            }
            else{
                patternMap.put(ch , str);
            }
            if(smap.containsKey(str)){
                if(smap.get(str) != ch){
                    return false;
                }
            }
            else{
                smap.put(str, ch);
            }
        }
        return true;
    }
}