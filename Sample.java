//Problem -1
// Time Complexity : 0(nklogn) where n=input size, k=avg length of string
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// The intuition is to sort the words in sorting order to get a key and store it in
//hashmap for easy retrival for comparision and return the stored array list of values
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> storage= new HashMap<>();
        for(String word:strs){
            char[] charArray=word.toCharArray();
            Arrays.sort(charArray);
            String key=Arrays.toString(charArray);
            if(!storage.containsKey(key)){
                storage.put(key, new ArrayList<String>());
            }
            storage.get(key).add(word);
        }
        return new ArrayList(storage.values());
    }
}

// Time Complexity : 0(n*k)
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// The intuition is to use a list of prime numbers mapped to every character in lower case alphabets
//Multiply all the characters to get a unique value and compare and store the mapped values to a list
//using hash map
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> storage= new HashMap<>();
        for(String word:strs){
            Double key=getPrimeNumber(word);
            if(!storage.containsKey(key)){
                storage.put(key, new ArrayList<String>());
            }
            storage.get(key).add(word);
        }
        return new ArrayList(storage.values());
    }

    private Double getPrimeNumber(String s){
        int[] primes=[2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,
                        83,89,97];
        Double value=1;
        for(char each:s){
            value=value*primes[each-'a'];
        }
        return value;
    }
}

//Problem - 2

// Time Complexity : 0(n) n=length of input strings
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/*
Intuition is to store the mapping of every char in s in a hashMap
and store every char map in t in another hashMap
While iterating check if it is already seen and mapped to the same element
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> sMap=new HashMap<>();
        HashMap<Character,Character> tMap= new HashMap<>();
        for(int i=0;i<s.length();i++){

            if(!sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),t.charAt(i));
            }else{
                if(sMap.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }

            if(!tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i),s.charAt(i));
            }else{
                if(tMap.get(t.charAt(i))!=s.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}

/*
Intuition is to store the mapping of every char in s in a hashMap
and the corresponding map of t in a hashset
*/

//TC:0(N) N=length of word
//SC:0(N)
import java.util.Map.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> sMap=new HashMap<>();
        HashSet<Character> tMap=new HashSet<>();
        for(int i=0;i<s.length();i++){

            if(!sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),t.charAt(i));
                if(!tMap.contains(t.charAt(i))){
                    tMap.add(t.charAt(i));
                }else{
                    for(Entry<Character,Character> entry: sMap.entrySet()){
                        if(entry.getValue().equals(t.charAt(i))){
                            if(entry.getKey()!=s.charAt(i)){
                                return false;
                            }
                        }
                    }
                }
            }else{
                if(sMap.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }

        }
        return true;
    }
}

