import java.util.*;

public class Anagrams2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> map = new HashMap<>();

        for(String s : strs){//n
            double pprod = primeProduct(s);//k

            map.putIfAbsent(pprod, new ArrayList<>()); //k
            map.get(pprod).add(s);
        }
        return new ArrayList(map.values());
    }

    private double primeProduct(String str){
        int [] prime = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        double product = 1;

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            product = product * prime[c - 'a'];
        }
        return product;
    }
}



