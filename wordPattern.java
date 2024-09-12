class Solution {

    public boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");

        if (pattern.length() != arr.length)
            return false;

        HashMap map = new HashMap();

        for (Integer i = 0; i < arr.length; i++) {

            String sStr = arr[i];
            char ch = pattern.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, i);
            }
            if (!map.containsKey(sStr)) {
                map.put(sStr, i);
            }
            if (map.get(ch) != map.get(sStr)) {
                return false;
            }
        }
        return true;
    }
}