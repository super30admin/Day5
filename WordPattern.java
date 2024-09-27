// Time Complexity: O(N)
// Space Complexity: O(N) // N number of strings
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Boolean> map2 = new HashMap<>();

        String[] words = s.split(" ");
        if( pattern.length() != words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            if(map1.containsKey(pattern.charAt(i)) ){
                if(!map1.get(pattern.charAt(i)).equals(words[i])){
                    return false;
                } else{
                    continue;
                }
            } else{
                if(map2.containsKey(words[i])){
                    return false;
                }else{
                    map1.put(pattern.charAt(i),words[i]);
                    map2.put(words[i],true);
                }

            }
        }
        return true;
    }
}