    /*  Explanation
    Time Complexity for operators : n*l
    Extra Space Complexity for operators : o(n)
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this : No
    Initillay I calaculted the multiplication of each character's assignmed prime value
    It will unique if the next string is anagram of previous one.
    Then, verified if that multiplciation is not part of hashmap if not then put it as a first element else 
    get the list and add this new anagram to list and update the hashmap
    */
import java.util.*;
class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
        //but the runtime complexity will be n * l (log l) and space will n
//         if(strs == null || strs.length==0)
//             return new ArrayList<>();
        
//         HashMap<String,ArrayList<String>> hm = new HashMap<>();
//         for(int i=0;i<strs.length;i++){
//             char[] c = strs[i].toCharArray();        // convert to array of chars 
//             Arrays.sort(c);          // sort
//             String newString = new String(c);
//             if(hm.containsKey(newString)){
//                 ArrayList<String> str = hm.get(newString);
//                 str.add(strs[i]);
//                 hm.put(newString,str);
//             }else{
//                 ArrayList<String> str = new ArrayList<>();
//                 str.add(strs[i]);
//                 hm.put(newString,str);
//             }   
//         }
        
//         return new ArrayList<>(hm.values());
        
            if(strs == null || strs.length==0)
                return new ArrayList<>();
        
            HashMap<Long,ArrayList<String>> hm = new HashMap<>();
            for(int i=0;i<strs.length;i++){
                long primemul = calcPrime(strs[i]);
                if(hm.containsKey(primemul)){
                    ArrayList<String> str = hm.get(primemul);
                    str.add(strs[i]);
                    hm.put(primemul,str);
                }else{
                    ArrayList<String> str = new ArrayList<>();
                    str.add(strs[i]);
                    hm.put(primemul,str);
                }   
            }  
        
                     return new ArrayList<>(hm.values());
    }
    
    private long calcPrime(String str){
        int[] primeArray = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        
        long total = 1;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            total = total * primeArray[ch - 'a'];
        }
        return total;
    }

    public static void main(String args[]){
            groupAnagrams gr = new groupAnagrams();
            String[] s = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
            List<List<String>> s1 = gr.groupAnagrams(s);
            System.out.println(s1);
    }
}