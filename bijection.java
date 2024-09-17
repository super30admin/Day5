//TC: O(n)   
//n - as pattern length and atmost n can be 26 letters so can be considered as constant  but in the for loop each search opeartion in HashMap2 takes O(k)
//O(k) can be said for each entry of string length of k 
//SC: O(n)  can be considered constant again as only 26 alphabets for map1 and utmost 26 strings as they are bijected to eachother 
//Doubt: We are using 2 different hasmaps right, why is it still O(n) unlike the TC operations( for eg 2 while loops can have O(n)), but the space or memory occupied is different know. 
// So if I use an array of size n and Hashmap of size n. Is the SC is still O(n)?
// Leetcode successful

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split(" ");
        if(pattern.length()!=str.length){
            return false;
        }
        HashMap<Character, String> map1=new HashMap();
        HashMap<String, Character> map2=new HashMap();
        for(int i=0;i<str.length;i++ ){
            char c=pattern.charAt(i);
            String w=str[i];
           if(!map1.containsKey(c)){
                map1.put(c,w);
                if(map2.containsKey(w))     // able to code but liitle confused at this step. Check the explanationa nd let me know if I am correct or not. 
                    return false; //Since they are one-one mapping, the word has to be inserted in the map only when the letter has occured right. Meant those are unique.
                map2.put(w,c);      // Explain me these steps if possible again.
            }
            else{
                if(!(map1.get(c).equals(w)) || (map2.get(w) != c))
                return false; 
            }
    }
         return true;
    }
}