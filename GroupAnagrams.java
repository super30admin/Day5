import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
          HashMap<Double, ArrayList<String>> map = new HashMap<>();
       // HashMap<String, List<String>> map = new HashMap<>();
        /* for (String s : strs) {
            char[] chArr = s.toCharArray();
            Arrays.sort(chArr);
            String sorted = String.valueOf(chArr);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }

      return new ArrayList<>(map.values());*/
        for(String s:strs){
            Double primeProduct=primeProduct(s);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct,new ArrayList<>());
            }
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private Double primeProduct(String s){
        int[] primes =
                new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};

        char[] sArr=s.toCharArray();
        Double prod=1d;
        for(char c:sArr){
            prod=prod*(primes[c-'a']);
        }
       return prod;
    }
}



       return resultLst;
    }
}