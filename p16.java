class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] words = s.split(" ");
        int p = pattern.length();
        int w = words.length;
        if(p!=w) return false;

        int i = 0;
        for (String word : words) {
            if (!map.containsKey(pattern.charAt(i))) {
                map.put(pattern.charAt(i), word);
            }
            i++;
        }

        for (int j = 0; j < pattern.length(); j++) {
            if(getKeyByValue(map,words[j])!=null){
                if(!(pattern.charAt(j) == getKeyByValue(map,words[j]))){
                    return false;
                }
            }else{
                return false;
            }

        }
        return true;
    }
    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}