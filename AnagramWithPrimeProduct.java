package HashFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

 /* 
    Time complexity : o(n*k) - n * traversing each element o(n) and calculate prime product for each word o(k).
    space complexity: o(n*k) --> o(n*k) map + o(n*k) for words in list
    Did this code run successfully in leetcode : yes
    problems faces : no
    calculate prime product for each word. the value of the prime product should be same for every possible word that can be formed using the characters of that word.
    Then create a hashmap and store the primeproduct as key and word as value.
    While putting the prime product check if that prime product  already exists ,if exists add word to values list.
    if the primeproduct doesnt exist then put the primeproduct at new key and word in value
*/
public class AnagramWithPrimeProduct {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs==null || strs.length==0) return null;
        
        HashMap<Long,List<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++)
        {
            String word = strs[i];
            long primeProduct = primeProduct(word);
            if(map.containsKey(primeProduct))
            {
                map.get(primeProduct).add(word);
             
            }
            else {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(word);
                map.put(primeProduct, anagrams);
                
            }
            
        }
        return  new ArrayList<>(map.values());
     }

    public long primeProduct(String s)
    {
      //prime numbers assigned to each of 26 alphabets
        long[] primeNumbers = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        char[] charArray = s.toCharArray();
        long primeProduct = 1 ;
        for(int i=0;i<charArray.length;i++)
        {
            primeProduct = primeProduct* primeNumbers[charArray[i]-'a']; // -a because character value start from 96, and our indexes are from 0. so b -'a' wil give 97-96=0
        }
        return primeProduct;
    }

    
}
