//time: O(n)
//space: O(n)
//Appraoch:
// the hashmap stores the pattern  and string str
// check if the character at pattern is presnet in the hashmap
    //-> if its present, check whether th evalue of the character at pattern(p) equals the striing at that index in str.
    // if the value in hashmap is not equal to str: return false
// similalry check if the str is present as the value  in the hashmap
    //-> if the str is present as the value, it means soem other key already has that mapped to it, in this cased return false
// if the key and value are not present for pattern and str respectively, put them in the hashmap.
// else return true;


class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] str1 = str.split(" ");
        
        HashMap<Character, String> hm = new HashMap<>();
        
        if(pattern.length() != str1.length){
            return false;
        }
        
        for(int i = 0; i < pattern.length(); i++){
            char p = pattern.charAt(i);
            if(hm.containsKey(p)){
                if(!hm.get(p).equals(str1[i])){
                    return false;
                }
            }
            else if(hm.containsValue(str1[i])){
                return false;
            }
            hm.put(p,str1[i]);
        }
        return true;
    }
}