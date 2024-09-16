// Time Complexity : O(n) 
// Space Complexity : O(n)
class IsomorphicPatterToWord {
    public boolean wordPattern(String pattern, String s) {
        String[] splitStr = s.split(" "); 
        if(pattern.length() != splitStr.length) return false;
        HashMap<Character, String> Pmap = new HashMap<>();
        HashMap<String, Character> Smap = new HashMap<>();
        for(int i=0; i<pattern.length();i++){
            char pchar = pattern.charAt(i);
            if(!Pmap.containsKey(pchar)){
                Pmap.put(pchar, splitStr[i]);
            }else{
                if(!splitStr[i].equals(Pmap.get(pchar))){
                    return false;
                }
            }
            if(!Smap.containsKey(splitStr[i])){
                Smap.put(splitStr[i], pchar);
            }else{
                if(Smap.get(splitStr[i]) != pchar){
                    return false;
                }
            }
        }
        return true;
    }
}