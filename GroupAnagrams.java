/*
    Time Complexity :- O(NK)
    Space Complexity :- O(26)
    Approach :- Take prime product of characters, because product prime numbers is always unique.
*/ 

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<Double,List<String>> map = new HashMap<>();
        
        for(String str : strs) {
            int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
            Double primeProd = getPrimeProd(prime,str);
            
            if(!map.containsKey(primeProd))
                map.put(primeProd,new ArrayList<>());
            
            map.get(primeProd).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
    
    public Double getPrimeProd(int[] prime, String str) {
        Double prod = 1.0;
        for(int i=0;i<str.length();i++) {
            prod = prod * prime[str.charAt(i)-'a'];
        }
        
        return prod;
    }
}
