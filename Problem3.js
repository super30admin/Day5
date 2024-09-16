//Time: O(n), Space: O(1)
//Solution Accepted on leetcode

var wordPattern = function(pattern, s) {
    let hash_map = {};
    let hash_set = new Set();
    s = s.split(" ");
    if(pattern.length !== s.length) return false;
    for(let i=0;i<pattern.length;i++){
        if(pattern[i] in hash_map){
            if(s[i] !== hash_map[pattern[i]] ) 
            {
                return false;
            }
        }else{
            if(hash_set.has(s[i])){
                return false;
            }
            hash_map[pattern[i]] = s[i];
            hash_set.add(s[i])
        }
    }
    return true;
};