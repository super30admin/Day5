//Time Complexity : O(n )
//Space O(1)
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        boolean isValid=true;
        String strArr[]= s.split(" ");
        char  chrArr[]=pattern.toCharArray();
        HashMap<Character,String> charMap=new HashMap<>();
        HashMap<String,Character> strMap=new HashMap<>();

        
        if(chrArr.length!=strArr.length || pattern==null || s==null){
            return false;
        }
        
        for(int i=0;i<chrArr.length;i++){
            
            if(!charMap.containsKey(chrArr[i]) && !strMap.containsKey(strArr[i]))
            {
                charMap.put(chrArr[i],strArr[i]);
                strMap.put(strArr[i],chrArr[i]);
                
            }
            else{
                char currChar=chrArr[i];
                String currStr=strArr[i];
                
                if(charMap.containsKey(currChar)){
                    
                    if(!currStr.equals(charMap.get(currChar)))
                        return false;
                    
                    
 
                }
                else{
                    if(strMap.containsKey(currStr)){
                        
                        //getValue StrMap
                        
                        
                        if(currChar!=strMap.get(currStr))
                            return false;

                        
                    
                }
            }
                      
        }
                              
        
    }
                 return true;       

}
}