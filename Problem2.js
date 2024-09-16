//Time: O(n), Space: O(1)
//Ran Successfully on leetCode - solution accepted
var isIsomorphic = function(s, t) {
    let hash_map = new Map()
    for(let i=0;i<s.length;i++){
        if(!hash_map.has(s[i])){
            hash_map.set(s[i],t[i])
        }else if(hash_map.get(s[i]) != t[i]){
            return false
        }
    }
    return new Set(hash_map.values()).size === hash_map.size
};
