class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Character>  stotMap = new HashMap<>();
        HashMap<Character, Character>  ttosMap = new HashMap<>();
        
        for(int i =0; i<s.length(); i++){
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            
            if(stotMap.containsKey(chs) && stotMap.get(chs) != cht){
                return false;
            }
            else
                stotMap.put(chs, cht);
            
            if(ttosMap.containsKey(cht) && ttosMap.get(cht)!=chs){
                return false;
            }
            else
                ttosMap.put(cht, chs);
        }
        return true;
        
        
    }
}

//TC: O(n)
//SC: O(n)
