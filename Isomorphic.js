/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    var sl = s.length;
    var tl = t.length;
    if(sl != tl) return false;
    var sMap = {};
    var tMap = {};
    for(let i =0; i < sl; i++){
       
        if(s.charAt(i) in sMap){
            if(sMap[s.charAt(i)] != t.charAt(i)) return false;
        }else {
            sMap[s.charAt(i)] = t.charAt(i);
           
        }

        if(t.charAt(i) in tMap){
            if(tMap[t.charAt(i)] != s.charAt(i)) return false;
        }else {
            tMap[t.charAt(i)] = s.charAt(i);
        }
    }
    return true;
};