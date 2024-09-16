// Time Complexity : O(mk) + O(nk)
// Space Complexity : O(nk) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sarray = s.split(" ");
        
        if(pattern.length()!=sarray.length){
            return false;
        }
        
        HashMap<Character,String> pmap = new HashMap<>();
        HashMap<String,Character> smap = new HashMap<>();
        
        for(int i=0;i<pattern.length();i++){
            char pchar = pattern.charAt(i);
            String sstring = sarray[i];
            
            if(pmap.containsKey(pchar)){
                if(!(pmap.get(pchar).equals(sstring))){
                    return false;
                }
            }else{
                pmap.put(pchar,sstring);
            }
            
            if(smap.containsKey(sstring)){
                if(smap.get(sstring)!=pchar){
                    return false;
                }
            }else{
                smap.put(sstring,pchar);
            }
        }
        
        return true;
    }
}

MY APPROACH:

Here approach is same as previous but matching character to string by star.equals(pchar) method;
In two hashmap <character,string> 
Splitting array according to pattern seeing like spaces 
Taking array of string so we will able to traverse small strings 
String[] stringarray = s.split(" ");  // spliting on space symbol

Time Complexity : 

O(mk)+ O(nk) whichever is larger here m is pattern length and nk is string length where n is words in string and k is characters in words like[abc bcd] here 3 characters and two words so N=n*k N=6. so mk for first hash map we are searching just k matches or not strings matches or not but m times so mk and nk is for second hash map each n words in string so n*k k is string matching time

Space Complexity: 

O(nk) as we are splitting string and storing into string array where String array costs k is length of words but n is number of words.





