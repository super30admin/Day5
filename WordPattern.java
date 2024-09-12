class Solution {
    // 2 hashmap to store mapping  of letters.
    // if the mapping exist and same then fine if not same return false
    // space: O(n)
    //time: 0(n)
    public boolean wordPattern(String pattern, String s) {
        String[] inputArr = null;
        if (s != null && s.length() != 0) {
            inputArr = s.split(" ");
        } else {
            return false;
        }

        if (pattern.length() != inputArr.length) {
            return false;
        }

        HashMap<Character, String> sMap = new HashMap<>();
        HashMap<String, Character> tMap = new HashMap<>();

        for (int i = 0; i < inputArr.length; i++) {
            if (sMap.containsKey(pattern.charAt(i))) {
                if (!sMap.get(pattern.charAt(i)).equals(inputArr[i])) {
                    System.out.println(sMap.entrySet());
                    return false;
                }
            } else {
                sMap.put(pattern.charAt(i), inputArr[i]);
            }

            if (tMap.containsKey(inputArr[i])) {
                if (tMap.get(inputArr[i]) != pattern.charAt(i)) {
                    System.out.println("tmap" + tMap.entrySet());
                    return false;
                }
            } else {
                tMap.put(inputArr[i], pattern.charAt(i));
            }
        }
        System.out.println(sMap.entrySet());

        return true;
    }
}
