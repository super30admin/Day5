import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<Double, List<String>> answer = new HashMap<>();
        
        for(int i = 0; i < strs.length; i += 1) {
            double product = calculateProduct(strs[i]);
            if(!answer.containsKey(product)) {
                answer.put(product, new ArrayList<>());
            }
            answer.get(product).add(strs[i]);
        }
        return new ArrayList<>(answer.values());
    }
    
    private double calculateProduct(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 2);
        map.put('b', 3);
        map.put('c', 5);
        map.put('d', 7);
        map.put('e', 11);
        map.put('f', 13);
        map.put('g', 17);
        map.put('h', 19);
        map.put('i', 23);
        map.put('j', 29);
        map.put('k', 31);
        map.put('l', 37);
        map.put('m', 41);
        map.put('n', 43);
        map.put('o', 47);
        map.put('p', 53);
        map.put('q', 59);
        map.put('r', 61);
        map.put('s', 67);
        map.put('t', 71);
        map.put('u', 73);
        map.put('v', 79);
        map.put('w', 83);
        map.put('x', 89);
        map.put('y', 97);
        map.put('z', 101);
        
        double product = 1;
        for(int i = 0; i < s.length(); i += 1) {
            product *= map.get(s.charAt(i));
        }
        return product;
    }
}
