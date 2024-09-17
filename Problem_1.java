//Time complexity-O(n)
//space complexity-O(n)
//tried the brute force, found this better, learnt the getOrDefault hashmap method
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null && strs.length==0)
        {
            return new ArrayList<>();
        }
        HashMap<Long, List<String>> hashmap=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            long prime=getPrime(strs[i]);
            List<String> unique=hashmap.getOrDefault(prime,new ArrayList<>());
            unique.add(strs[i]);
            hashmap.put(prime,unique);
                
            
        }
        return new ArrayList<>(hashmap.values());
        
        
    }
    
    public long getPrime(String s)
    {
        int primeArray[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        long total=1;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            total=total*primeArray[ch-'a'];
        }
        return total;
    }
    
    
    }
    
