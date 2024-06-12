/**
 * @param {string} pattern
 * @param {string} str
 * @return {boolean}
 */
var wordPattern = function(pattern, str) {
    let words = str.split(' ');
    if(pattern.length !== words.length) return false;
    let map = new Map();
    let set = new Set();

    for(let i = 0 ; i < pattern.length ; i++ ){
        if(map.has(pattern[i])){
            if(map.get(pattern[i]) != words[i]) return false;
        } else {
            if(set.has(words[i])) return false;
            map.set(pattern[i],words[i]);
            set.add(words[i]);
        }
    }

    return true;

};