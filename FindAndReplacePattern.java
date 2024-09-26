// TIme Complexity: O(nc) where n is no of words and c is maximum no of characters among all the words
// Space Complexity: O(512)
// Problem ran successfully on leetcode
class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        int[] word = new int[256];
        int[] patt = new int[256];
        for(int i = 0; i<words.length; i++) {
            if(words[i].length()!=pattern.length()){
                continue;
            }
            String w = words[i];
            Arrays.fill(word, 0);
            Arrays.fill(patt, 0);
            boolean add = true;
            for(int j =0; j<w.length(); j++) {
                if(patt[pattern.charAt(j)] != word[w.charAt(j)]) {
                    add = false;
                    break;
                }
                patt[pattern.charAt(j)] = j + 1;
                word[w.charAt(j)] = j + 1;
            }
            if(add){
                res.add(w);
            }

        }
        return res;
    }
}