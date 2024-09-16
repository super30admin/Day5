class Solution {
    public boolean wordPattern(String pattern, String str) {
     
        String[] words = str.split(" ");
        //Hashmap for Char to String mapping
        HashSet<String> used = new HashSet<String>();
        HashMap<Character, String> map = new HashMap<Character, String>();
        if(words.length != pattern.length())
            return false;
        for(int i = 0; i < pattern.length(); ++i){
            char key = pattern.charAt(i);
            //System.out.println("*********************");
            if(map.containsKey(key) == true){
                //letter is already mapped
                //check if the word is alredy mapped
                    //if mapping is not same then termiate
                    if(!map.get(key).equals(words[i])){
                     //if not correct mapping terminate
                         // //System.out.println(key +"**"+ map.get(key) +"++"  +words[i]);
                        return false;
                }
            }
            else
            {
                //new mapping
                
                //make sure word is already not used
                 if(used.contains(words[i])){
                  //System.out.println(key + "++"  +words[i]);
                     //word is already mapped
                     return false;
                 }else{
                     //word is not mapped
                     map.put(key,words[i]);
                     used.add(words[i]);
                 }
            }
            }
      return true;    
        }
    }
 /*
 Time Complexity:
 O(n) where n is size of str
 Space Complexity:
 O(m)
 where m is number of unique chars in pattern
 */
