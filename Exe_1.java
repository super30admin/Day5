class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> map = new HashMap<>();
        
        for (String s : strs){
            double hash = gethash(s);
            if (!map.containsKey(hash)){
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(s);
        }
        List<List<String>> out = new ArrayList<>();
        for(List<String> value : map.values()){
            out.add(value);
        }
        return out;
        
        }
    private static double[] p = new double[]{
            2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        private double gethash (String s){
        double hash = 1;
        for (int i = 0; i<s.length(); ++i){
        int c = s.charAt(i);
            hash = hash*p[c-'a'];}
        return hash;
    }
}
