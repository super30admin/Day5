
/*
-Time Complexity : O(n*klogk) as we are traversing over n strings in a list and sorting each string to find anagram. k is maximum string length
-Auxiliary Space : O(n)
-Did this code successfully run on Leetcode :Yes
-Any problem you faced while coding this : No
-Your code here along with comments explaining your approach
------1st approach sorting------
    1. Anagram looks same when they sare sorted.
    2. We will keep track of all those words which looks same when they are sorted.
    3. We iterate over all the words we are given sort them and add them to the list of word that also looks same when          sorted. 
    4. we can store this in hashmap, with sorted word as key and List of words which look same when sorted. 
       and return all the lists we got.
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<String>> finalList = new ArrayList<>();
        Map<String, List<String>> map= new HashMap<>();
        for(String s : strs){
            char[] cArray = s.toCharArray();
            //sort string
            Arrays.sort(cArray);//["eat", "tea"-"aet"]
            String keyString = new String(cArray);
            //check if word after sorting exists in the map, if not add and add one array list for that.
            if(!map.containsKey(res))
                map.put(res,new ArrayList<String>());
            map.get(res).add(s);
        }
        return  new ArrayList<List<String>>(map.values());
    }
}



/*
-Time Complexity : O(nk) where k is length of each string and n is the total number of words.
-Auxiliary Space : O(n) // using hashmap
-Did this code successfully run on Leetcode :Yes
-Any problem you faced while coding this : No
-Your code here along with comments explaining your approach
------1st approach: using prime number------
    1. Map all 26 characters to 26 unique prime numbers.
    2. we will use prime product stragety.
    2. For every string, take prime products of whole string
    3. We iterate over all the words we are given find prime product and add them to the list of word that also  
       has the same prime product.
    4. we can store this in hashmap, with one word as key and List of words which has same prime product as list
       and return all the lists we got.
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<String>> finalList = new ArrayList<>();
        Map<Long, List<String>> map= new HashMap<>();
        for(String s : strs){
            //calculate prime product of each word.
            long res = calculatePrimeProd(s);
            if(!map.containsKey(res))
                map.put(res,new ArrayList<String>());
            //add all words with same prime product in the same list in the map.
            map.get(res).add(s);
        }
        return  new ArrayList<List<String>>(map.values());
    }
    /*
    Calculate Prime product
    */
    private Long calculatePrimeProd(String s){
        int [] prime = 
        {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,103};
        char[] cArray = s.toCharArray();
        long res=1;
        for(int i=0; i< cArray.length; i++){
            res *= prime[s.charAt(i)-'a'];
        }
        return res;
    }
}




