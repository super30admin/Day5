class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Delaring 2 hashmaps 
        //one to map s to t 
        //second to map t to s
        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();
        
        //loop throgh the length of the string
        for(int x = 0; x < s.length(); x++){
            char chs = s.charAt(x);// storing character of s 
            char cht = t.charAt(x);// storing character of t
            
            //S-> T
            //if the map sToT already in the map then 
            //we are checking if value matches the value of t
            //if value dosent match then return false
            if(sToT.containsKey(chs) && sToT.get(chs) != cht){ 
                return false;
            }else{//if value is not present the add key and value to map
                sToT.put(chs, cht);
            }
            
            // T->S
            //if the map tToS already in the map then 
            //we are checking if value matches the value of s
            //if value dosent match then return false
            if(tToS.containsKey(cht) && tToS.get(cht) !=chs){
                return false;
            }else{//if value is not present the add key and value to map
                tToS.put(cht, chs);
            }
        }
        //after comparing all the values 
        //return true
        return true;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)