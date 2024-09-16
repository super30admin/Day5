// Time Complexity : O(n); n = length of s/pattern
// Space Complexity : O(n); use of hashmap & hashset
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();

        if (words.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(p)) {
                if (!map.get(p).equals(word))
                    return false;
            }
            else {
                map.put(p, word);
            }
        }

        HashSet<String> set = new HashSet<>();

        for (String w : map.values()) {
            if (set.contains(w)) return false;
            set.add(w);
        }
        return true;
    }
    //Method - 2
//    String[] words = s.split(" ");
//        if (words.length != pattern.length()) return false;
//
//    HashMap<Character, String> PtoSMap = new HashMap<>();
//    HashMap<String, Character> StoPMap = new HashMap<>();
//
//
//
//        for (int i = 0; i < pattern.length(); i++) {
//        char p = pattern.charAt(i);
//        String word = words[i];
//
//        if (PtoSMap.containsKey(p)) {
//            if (!PtoSMap.get(p).equals(word))
//                return false;
//        }
//        else {
//            PtoSMap.put(p, word);
//        }
//        if (StoPMap.containsKey(word)) {
//            if (!StoPMap.get(word).equals(p))
//                return false;
//        }
//        else {
//            StoPMap.put(word, p);
//        }
//
//    }
//
//
//        return true;
}