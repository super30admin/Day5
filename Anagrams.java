import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//Approach 1

//Time Complexity: 0(nk);Where n  is the length of the input string and k is the max length of each string in array
//Space complexity: 0(n)
//Did it successfully run on leetcode: Yes
//Did you face any problems: No

//In short explain your approach: I took a hashmap with key as double data type and value as array list. I assigned a prime no.
//to each character in the string and calculated their product to give a unique key. Then checked if the key existed in the
//hashmap or not. If it did not exist, then created a new key and an array list to store the value and if it existed,
//then updated the array list with the new addition value.

class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return null;
        }
        HashMap<Double, List<String>> anagrams= new HashMap<>();
        for(String s:strs){
            double prime = primeno(s);
            if(!anagrams.containsKey(prime)){
                anagrams.put(prime, new ArrayList<>());
            }
            anagrams.get(prime).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }
    public double primeno(String s){
        int[] prime = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double product = 1;
        for(int i= 0; i<s.length(); i++){
            char a = s.charAt(i);
            product = product * prime[a - 'a'];
        }
        return product;
    }
}

//Approach 2

//Time Complexity: 0(nklogk);Where n  is the length of the input string and k is the max length of each string in array
//Space complexity: 0(n)
//Did it successfully run on leetcode: Yes
//Did you face any problems: No

//In short explain your approach: I tool a hashmap with key as string and value as arraylist. Then i went and iterated through
//each word in the string. Broke the string down to characters, sorted the characters and again combined the sorted characters
//into a string. Then checked if the key existed in the hashmap or not. If it didnt exist, created a new key value pair,
//adding value to the array list and if it existed, then updated the previous array list with the new value.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String s:strs){
            char [] a = s.toCharArray();
            Arrays.sort(a);
            String b = String.valueOf(a);
            if(!map.containsKey(b)){
                map.put(b , new ArrayList<>());
            }
            map.get(b).add(s);
        }
        return new ArrayList<>(map.values());
    }
}