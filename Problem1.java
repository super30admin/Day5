class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int [] primeNumber=new int []{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        HashMap<Double, List<String>> map = new HashMap<>();

        for(String s:strs){
            double res = 1l;
            for(char c:s.toCharArray())
                res*=primeNumber[c-'a'];
            List<String> l =map.getOrDefault(res,new ArrayList<String>());
            l.add(s);
            map.put(res,l);
        }
        List<List<String>> res = new ArrayList<>();

        for(List<String> l:map.values())
            res.add(l);
        return res;
    }
}