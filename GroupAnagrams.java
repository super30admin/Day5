//Approach 1 : T.C = O(nklogk) where n is no of strings and k is average length of string S.C = O(n) (sorting and storing )
// Approach 2: T.C =O(nk) (making unique code for each srting using prime no.s)
// S.C = O(1)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
//         HashMap<Double, List<String>> = new HashMap<>();
//         for(String s : strs )
//         {
//             double hashIndex = primeProduct(s);
//                 if(!h1.containsKey(hashIndex))
//                 {
//                     h1.put(hashIndex, new ArrayList<>());
//                 }
            
            
//                 h1.get(hashIndex).add(s);
            
//         }
        
//         public int primeProduct ( String s)
//         {
//             double res = 1;
//             int[] prime = {2,3,5}
            
//             for(int i=0;i<s.length;i++)
//             {
//                 char c= s.charAt(i);
//                 res= res*prime[c-'a'];
//             }
//             return res;
//         }
        
        HashMap<String,List<String>> h1 = new HashMap<>();
        for(String s : strs)
        {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray);
            if(!h1.containsKey(sorted))
            {
                h1.put(sorted,new ArrayList<>());
            }
            
            h1.get(sorted).add(s);
            
        }
        
        return new ArrayList<>(h1.values());
        
        
    }
}