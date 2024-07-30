import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Similar to Isomorphic problem.
// used a  hashmap and hashset for mapping a->b and then mapping all the values of b

/*
 * Time Complexity = O(n) <- 1 pass
 * Space complexity = O(1) <- max 26 mappings of key value pairs and 26 values in the set.
 */

class PatternMatcher {
    public boolean wordPattern(String pattern, String s) {
        Map<String, String> sMap = new HashMap<>();
        Set<String> tSet = new HashSet<>();
        String[] patterns = pattern.split("");
        String[] res = s.split(" ");
        // satisfying a leetcode condition that the length of both the inputs should be same.
        if(patterns.length != res.length){
            return false;
        }
        for(int i=0;i< res.length;i++) {
            res[i] = res[i].trim();
            if(sMap.containsKey(patterns[i])) {
                if(!sMap.get(patterns[i]).equals(res[i])) {
                    return false;
                }
            } else {
                if(tSet.contains(res[i])) {
                    return false;
                } else {
                    sMap.put(patterns[i], res[i]);
                    tSet.add(res[i]);
                }
            }
        
        }
    return true;
    }
}