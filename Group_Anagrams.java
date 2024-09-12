class Solution {
    //Time O(Nk)
    //Space O(N)
/*
 Intution : anagrams should give same string when sorted so we can use sorted strings as key for hashmap to efficiently match the anagrams
 Intution2 : we can further optimize it by using primes factors as an ascii values of charcater whose product will fetch unique number which will be same for anagrams
*/
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs == null || strs.length == 0)
       {
           return new ArrayList<>();
       }
        HashMap<Long , List<String>> map = new HashMap<>();
        for(int i=0 ; i<strs.length ; i++)
        {
            long num = uniquenumber(strs[i]);
            if(!map.containsKey(num))
            {
                map.put(num , new ArrayList<String>());
            }
            map.get(num).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
    public long uniquenumber(String s)
    {
        int num[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        long res = 1;
        for(int i=0 ; i<s.length() ; i++)
        {
            res *= num[s.charAt(i)-'a'];
        }
        return res;
    }
}