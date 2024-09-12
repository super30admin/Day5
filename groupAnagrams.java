// Time Complexity : O((n)*(k*k)*(logk))- where n is the number of strings, klogk for sorting each string and another k for hashmap comparision
// Space Complexity : O(n) - where n is the list of the strings given.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
// Your code here along with comments explaining your approach: We sort each string, the sorted string is placed as a key in the hashmap and the value is a list of the original strings that match the key. At the end, we iterate through the hashmap to give away all the values


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      if(strs==null || strs.length==0) return new ArrayList<>();
      Map<String,List<String>> hmap=new HashMap<String,List<String>>();
      for(int i=0;i<strs.length;i++){
          char[] arr=strs[i].toCharArray();
          Arrays.sort(arr);
          String s=String.valueOf(arr);
          if(!hmap.containsKey(s)){
              hmap.put(s,new ArrayList<>());
             
          }
               hmap.get(s).add(strs[i]);
      }
          
        return new ArrayList<>(hmap.values()); 
      }     
    
}

// Time Complexity : O(nk) - where n is the number of strings and k is the average size of each string. we traverse through n strings each of size k.
// Space Complexity : O(n) - where n is the list of the strings given.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
// Your code here along with comments explaining your approach: Here, in this approach we are eliminationg the necessity of sorting the string by using the prime factor approach.



class Solution {
    int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
    public List<List<String>> groupAnagrams(String[] strs) {
      if(strs==null || strs.length==0) return new ArrayList<>();
      Map<Long,List<String>> hmap=new HashMap<>();
      for(int i=0;i<strs.length;i++){
          long s= primeCode(strs[i]);
          if(!hmap.containsKey(s)){
              hmap.put(s,new ArrayList<>());
          }
               hmap.get(s).add(strs[i]);
      } 
        return new ArrayList<>(hmap.values()); 
      }
    
    private long primeCode(String s){
        long result=1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            result=result*primes[c-'a'];
        }
        return result;
    }
    
}