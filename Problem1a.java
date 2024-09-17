// Time Complexity : O(NL): N- length of array, L - max length of a string in array | LLogL - to sort the string
// Space Complexity : O(N*L) + O(26) - To create hashmap we need NL and primes is of size 26. But that is constant. So, O(1).
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;

class Problem1a {
    
    public static List<List<String>> groupAnagram(String[] arr){

        HashMap<Long,List<String>> map = new HashMap<>();
        for(String str: arr){
            long prod = product(str);
            if(!map.containsKey(prod)){
                map.put(prod,new ArrayList<>());
            }
            map.get(prod).add(str);
        }
         
        return new ArrayList<>(map.values());
    }


    private static long product(String str){

        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,51,59,61,67,71,73,79,83,89,97,101,103};
        int prod=1;
        for(char c:str.toCharArray()){
            prod=prod*primes[c-'a'];
        }
        return prod;
    }

    public static void main(String[] args){
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat", "nidhi", "hindi"};
        List<List<String>> res = groupAnagram(arr);

        for(int i=0;i<res.size();i++){
            List<String> temp1 = res.get(i);
            for(int j=0;j<temp1.size();j++){
                System.out.print(temp1.get(j)+ " ");
            }
            System.out.println();
        }
    }

    
    }