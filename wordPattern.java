/*
Time Complexity-->
O(n)

Space Complexity -->
O(n) for dictionary

Approach-->
1. Loop through the pattern list and if a new character is encountered push it to a map with word in s
2. if already presrnt check if the word matches with the previous value if yes rcontinue else return false
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");
        // for(int i=0;i<words.length;i++){
        //     System.out.println(words[i]);
        // }
        // int v = pattern.length();
        // System.out.println(v);
        
        if(pattern.length()!=words.length){
            return false;
        }
        
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        //String word = 0;
        int w = 0;
        for(int i=0;i<pattern.length();i++){
            char val = pattern.charAt(i);
            if(map.containsKey(val)){
                // System.out.println(map.get(val));
                // System.out.println(words[w]);
                
                if(map.get(val).equals(words[w])){
                    w+=1;
                    continue;
                }//if
                else{
                    return false;
                }
                
                
            }//if
            
            else{
                if(set.contains(words[w])){
                    return false;
                    
                }//if
                
                else{
                    map.put(pattern.charAt(i), words[w]);
                    set.add(words[w]);
                    w+=1;
                    
                    
                }
            }
            
            //System.out.println(map);
            
            
        }//for
        return  true;
        
    }
}