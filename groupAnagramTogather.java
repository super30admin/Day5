/**
Time complexity : O(n*K) n= no of strings k = no of chars in string
Space complexity : O(1)
Did it run on Leetcode : NO some test case failed

 */


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs==null || strs.length<1){
            return null;
        }
        Map<Character, Integer> primes = new HashMap<>();
        primes.put('a',2);
        primes.put('b',3);
        primes.put('c',5);
        primes.put('d',7);
        primes.put('e',11);
        primes.put('f',13);
        primes.put('g',17);
        primes.put('h',19);
        primes.put('i',23);
        primes.put('j',29);
        primes.put('k',31);
        primes.put('l',37);
        primes.put('m',41);
        primes.put('n',43);
        primes.put('o',53);
        primes.put('p',59);
        primes.put('q',61);
        primes.put('r',67);
        primes.put('s',71);
        primes.put('t',73);
        primes.put('u',79);
        primes.put('v',83);
        primes.put('w',89);
        primes.put('x',97);
        primes.put('y',101);
        primes.put('z',103);
        
        Map<Long, List<String>> anagramMap = new HashMap<>();
        for(String word : strs){
            char[] seqWord = word.toCharArray();
            long hash = 0;
            for(char a : seqWord){
                hash =hash+ (a-' ' * primes.get(a));
            }
                if(!anagramMap.containsKey(hash)){
                anagramMap.put(hash, new ArrayList());
            }
                anagramMap.get(hash).add(word);
                
                
            
        }
        return new ArrayList(anagramMap.values());
    }
}