class Solution {
    public boolean wordPattern(String pattern, String str) {
       
        HashMap<Character, String> hm = new HashMap<>();
        HashSet<String> hs= new HashSet<>();
        String[] arr = str.split(" ");
        if(arr.length!= pattern.length()){
            return false;
        }
        
        for(int i=0; i<pattern.length(); i++){
            if(!hm.containsKey(pattern.charAt(i))){
                if(hs.contains(arr[i])){
                    return false;
                }
                hm.put(pattern.charAt(i),arr[i]);
                hs.add(arr[i]);
            }
            else{
               
                if(!hm.get(pattern.charAt(i)).equals(arr[i])){
                   
                    return false;
                }
                
            }
        }
        return true;
    }
}