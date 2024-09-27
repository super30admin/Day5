/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
   pattern=pattern.split('');
    s = s.split(' ');
    var map=new Map();
    if(pattern.length!==s.length)
      return false;
    for(let i=0;i<pattern.length;i++)
    {
        if(!map.has(pattern[i]))
        {
            map.set(pattern[i],s[i]);
        }
        else
        {
            if(map.get(pattern[i])!==s[i])
            {
                return false;
            }
        }
    }
    return new Set([...map.values()]).size===map.size; 
};