//TC: O(n)
//SC:O(n)
//successfully ran on leetcode

class Solution {
    public List<List<String>> groupAnagrams(String[] strs)
    {
        HashMap<Double,List<String>> hashmap=new HashMap<>();

        for(String s:strs)
        {
            //calculate the primekey
            double primekey=calculatePrime(s);
            //if hashmap does not contain the primekey add new entry of primekey:empty array to the hashmap
            if(!hashmap.containsKey(primekey))
            {
                hashmap.put(primekey,new ArrayList<>());
            }
            //otherwise add the letter s to the array of the primekey
            hashmap.get(primekey).add(s);
        }
        return new ArrayList<>(hashmap.values());
    }

    private double calculatePrime(String st)
    {
        int[] primes={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};

        double result=1;

        for(int x=0; x<st.length(); x++)
        {
            result=result*primes[st.chartAt(x)-'a'];
        }
        return result;

    }
}
