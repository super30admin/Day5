// Time Complexity : O(nklogk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : i have faced some syntax issues later i were able to resolve those


// Your code here along with comments explaining your approach :
// I used a `HashMap<String, List<String>>`, where the key is the sorted version of each word for O(1) lookup, and the value is a list of words with the same key. If the key is not in the map, I add a new entry with an empty list; otherwise, I add the word to the existing list.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> sMap=new  HashMap<String,List<String>>();
        for(String s: strs){ //n
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray); // klogk
            String sortedString = new String(charArray);
            if(!sMap.containsKey(sortedString)){ 
                sMap.put(sortedString,new ArrayList<String>());
            }
            sMap.get(sortedString).add(s);
        }
        return new ArrayList<>(sMap.values());
    }
}
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : i have faced some syntax issues later i were able to resolve those


// Your code here along with comments explaining your approach :
// I used a HashMap<Double, List<String>>, where the key is the prime product of each word for O(1) lookup, and the value is a list of words with the same key. If the key is not in the map, I add a new entry with an empty list; otherwise, I simply add the word to the existing list.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> sMap=new  HashMap<Double,List<String>>();
        for(String s: strs){ //n
             double primeP=primeProduct(s);
            if(!sMap.containsKey(primeP)){ 
                sMap.put(primeP,new ArrayList<>());
            }
            sMap.get(primeP).add(s);
        }
      
        return new ArrayList<>(sMap.values());
    }
      double primeProduct(String s){
             int[] primeNumbers=new int[] {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,81,83,89,97,101,103};

          double result=1l;
          for(int i=0;i<s.length();i++){
            char ct=s.charAt(i);
              result=result* primeNumbers[ct-'a'];

          }
          return result;
        }
}