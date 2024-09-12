class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        String[] strArray = str.split(" ");
        
        if (pattern.length() != strArray.length) {
            return false;
        }
        
        HashMap<Character, String> myMap = new HashMap();
        
        for (int index=0; index < strArray.length; index++) {
            Character c = pattern.charAt(index);
            if (myMap.containsKey(c)) {
                if (myMap.get(c).equals(strArray[index])) {
                    
                } else {
                    return false;
                }
            } else {
                myMap.put(c, strArray[index]);
            }
        }
        
        HashMap<String, Character> myMap2 = new HashMap();
        for (int index=0; index < strArray.length; index++) {
            Character c = pattern.charAt(index);
            if (myMap2.containsKey(strArray[index])) {
                if (myMap2.get(strArray[index]).equals(c)) {
                    
                } else {
                    return false;
                }
            } else {
                myMap2.put(strArray[index], c);
            }
        }
        
        return true;
    }
}
