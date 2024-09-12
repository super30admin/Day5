// Time complexity - len of words
// space complexity - one hashmap
// works on leet code

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        int len = words.length;
        HashMap<Character, String> firstMapping = new HashMap<>();
        
        if(pattern.length() != len){
            return false;
        }

        for(int i =0; i < len; i++){
            if (firstMapping.containsKey(pattern.charAt(i))){
                if(!firstMapping.get(pattern.charAt(i)).equals(words[i])){
                    return false;
                }
            }
            else if (firstMapping.containsValue(words[i])) {
                return false;
            }
            else{
                firstMapping.put(pattern.charAt(i), words[i]);
            }
        }
        return true;
    }
}
