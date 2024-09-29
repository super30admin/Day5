class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return null;
        HashMap<Double,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            double hash=gethash(strs[i]);
            List<String> li;
            if(!map.containsKey(hash)){
                li = new ArrayList<>();
            }
            else li = map.get(hash);
            li.add(strs[i]);
            map.put(hash,li);
        }
        return new ArrayList<>(map.values());
    }
    private double gethash(String s){
        int []prime = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};//primeno(26);
        double prod=1;
        for(int i=0;i<s.length();i++){
            prod*=prime[s.charAt(i) - 'a'];
        }
        return prod;
    }
    /*
    private int[] primeno(int n){
        int []prime=new int [n];
        boolean flag=false;
        int count=-1;
        for(int i=2;i<Integer.MAX_VALUE;i++){
            for(int j=2;j<i;j++){
                if(i%j==0) {
                    flag=true;
                    break;
                }
            }
            if(flag==false) {
                prime[++count]=i;
            }
            if(count==n-1) break;
            flag=false;
        }
        return prime;
    }
    */
}
