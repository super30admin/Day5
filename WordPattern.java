// time - O(n) , space - O(n) where n is the length of the pattern
// We iterate over the pattern and look for the character at the
//partular index in the hashmap and if the value 
//returned doesnt match we return false

class Solution{
    
   public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map=new HashMap<Character,String>();
        String str[]=s.split("\\s");
        if(str.length==pattern.length()){
             for(int i=0;i<pattern.length();i++){
                if(!map.containsKey(pattern.charAt(i))){
                    if(!map.containsValue(str[i])){
                         map.put(pattern.charAt(i),str[i]);
                    }else
                        return false;
                }else{
                    if(!map.get(pattern.charAt(i)).equals(str[i]))
                        return false;
                }
             }
            return true;
        }else
            return false;
    }
  

]
