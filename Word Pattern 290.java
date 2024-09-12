class Solution {// O(n) time for for loop and O(n + k ) time for split
    public boolean wordPattern(String pattern, String s) {
        
        // String[] p = pattern.split("(?!^)");
        String[] str = s.split(" ");
         //Check string lenght equal or not
       if(pattern.length() != str.length) return false;
        
        //creating Hashmap to store mapping
        HashMap<Character, String> mapp = new HashMap<>();
        
        for(int i=0; i<pattern.length() ; i++){ // time complexity of O(n)
            //creating and checking the mapping of each caharter
            char c1 = pattern.charAt(i);
            String c2 = str[i];
            // System.out.println(c1+"--->"+ c2);
            //checking whether the key is in map or not
            if(mapp.containsKey(c1)){
                // System.out.println(mapp.get(c1));
                if(mapp.get(c1).equals(c2)==false){
                   return false ; 
                    
                }
            }else{
                // if map does not contains key but value is present the mapping incorrect
                  if(mapp.containsValue(c2)) return false;
                //key val no present then add a mapping for it
                // System.out.println("put");
                mapp.put(c1,c2);
            }
        }
        return true;
    }
}   