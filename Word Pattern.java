class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");//tc-O(M)
        
        if(pattern.length() != strs.length) return false;

        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){//tc- O(n)
            char pChar = pattern.charAt(i);
            String st = strs[i];
            if(pMap.containsKey(pChar)){
                if(!pMap.get(pChar).equals(st)){
                    return false;
                }
            }else{
                pMap.put(pChar, st);
            }

            if(sMap.containsKey(st)){
                if(!sMap.get(st).equals(pChar)){
                    return false;
                }
            }else{
                sMap.put(st, pChar);
            }

        }
        return true;
    }
}
//can also use 1 hashset, 1 hashmap