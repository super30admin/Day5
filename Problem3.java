/** Leet Code Submitted : Yes 
Time Complexity = O(n)
Space Complexity = O(1)
Same as isomorphic by keeping index of two hashmaps 
**/

class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> hm1 = new HashMap<>();
        HashMap<String,Character> hm2 = new HashMap<>();
        
        String[] split = str.split(" ");
        
        if(split.length == 0)
            return false;
        
        System.out.println(split.length);
     
        
        if(split.length == 1 && pattern.length() == 1)
            return true;
        if(split.length != pattern.length())
            return false;
        
        for(int i =0; i< pattern.length(); i++){
            //System.out.println(split[i]);
            //System.out.println(pattern.charAt(i));
            
            if(hm1.containsKey(pattern.charAt(i))){
                System.out.println(split[i] + hm1.get(pattern.charAt(i)));
                
                    
                if(!split[i].equals(hm1.get(pattern.charAt(i)))){
                    //System.out.println("A");
                    return false;
                }
                    
            }else{
                hm1.put(pattern.charAt(i),split[i]);
                //hm2.put(split[i],pattern.charAt(i));
            }
            
            if(hm2.containsKey(split[i])){
                if(!hm2.get(split[i]).equals(pattern.charAt(i))){
                    //System.out.println("B");
                    //System.out.println(split[i]);
                    return false;
                }
                    
            }else{
                //hm1.put(pattern.charAt(i),split[i]);
                hm2.put(split[i],pattern.charAt(i));
            }
            
            
        }
        
        return true;
        
        
    }
}