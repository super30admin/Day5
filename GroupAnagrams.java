class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String st: strs)
        {
           double primeprod = primeProduct(st);
           
           
            if(!map.containsKey(primeprod))
            {
                map.put(primeprod, new ArrayList<>());
            }
            map.get(primeprod).add(st);
        }
        return new ArrayList<>(map.values());
    }

private double primeProduct(String st)
{ int prime[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173};
    double res =1L;
    for(int i=0;i<st.length();i++)
    {
            char ch = st.charAt(i);
            res=res*(prime[ch - 'a']);

    }
    return res;
}
}

//Time Complexity: O(n X k), where n is the number of strings and k is the average length of the strings.
//Space Complexity: O(n), where n is the number of strings in the input array.