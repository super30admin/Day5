//Explain your approach in **three sentences only** at top of your code
// I have used the same approach as in IsomorphicStrings  
// I have created a hashmap to store the mapping of characters from pattern to string s. 
// I have also created a hashset to store the characters of string s. 
// I have iterated over the characters of pattern and checked if the character is already present in the hashmap. If it is present, 
// I have checked if the mapping is correct. If it is not correct, I have returned false. If the character is not present in the hashmap, I have added the mapping to the hashmap and checked if the character in string s is already present in the hashset. If it is present, I have returned false. If it is not present, I have added the character to the hashset. If I reach the end of the loop, I have returned true. The time complexity is O(n) where n is the length of the input strings pattern and s.


class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> a = new HashMap<>();
        String[] split_string = s.split(" ",-1);
        if(pattern.length() != split_string.length){
            return false;
        }
            for (int i = 0; i < pattern.length(); i++) {
                if(a.containsKey(pattern.charAt(i))){
                    String n = a.get(pattern.charAt(i));
                    if(!n.equals(split_string[i])){
                        return false;
                    }
                }
                else if(a.containsValue(split_string[i])){
                    return false;
                }
                else{
                    a.put(pattern.charAt(i),split_string[i]);
                }
            }
            
            return true;
    }
}