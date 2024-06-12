/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    var c = {};

    var b;


    strs.forEach( x => {

        b =  x.split('').sort().toString();

        if(c[b] === undefined){
            c[b] = [x];
        } else {
            c[b].push(x);
        }

    })

    // Object.assign({},b);
    var output = [];

    for(let mapping in c){
        output.push(c[mapping]);

    }
    return output

};