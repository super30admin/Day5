class Solution {
    public boolean wordPattern(String s, String pattern) {

        HashMap<Character,String> map = new HashMap<>();

        char [] ch = s.toCharArray();
        String [] str = pattern.split(" ");

        if(ch.length != str.length){
            return false;
        }

        for(int i=0;i<=ch.length-1;i++){
            if(!map.containsKey(ch[i])){
                if(!map.containsValue(str[i])){
                    map.put(ch[i],str[i]);
                }
                else{
                    return false;
                }
            }
            else if(!map.get(ch[i]).equals(str[i])){
                return false;            
            }
            

        }
        return true;
        
    
    }
}