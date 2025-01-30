//Time Complexity : O(nklogk)-n no of string , klogk sort strings 
//Space Complexity :O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        } 
         Map<String, List<String>> map = new HashMap<>();
          for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray); //klogk
            String sortedStr = new String(charArray);
            
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        
        return new ArrayList<>(map.values());  
    }
}




///Approach 2
// Time Complexity : O(nK), n= length of strs, K = length of longest string

// Space Complexity : O(n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        } 
         Map<Double, List<String>> map = new HashMap<>();
          for (String s : strs) {
            double pp = PrimeProduct(s);
            if(!map.containsKey(pp)){
                map.put(pp,new ArrayList<String>());
            }
            map.get(pp).add(s);
        }
        
        return new ArrayList<>(map.values());  
    }


private double PrimeProduct(String s){
        int[] primeNum = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,103};
        double result = 1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            result = result * primeNum[ch-'a'];
        }

        return result;
    }
}