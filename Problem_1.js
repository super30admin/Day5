// Time Complexity : O(N), N is the length of array
// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Check if number is prime
var isPrime = (n) => {
    if (n === 0 || n === 1)
        return false;
    for (let i = 2; i < n; i++) {
        if (n % i === 0)
            return false;
    }
    return true;
}

var getPrimes = (n) => {
    if (n == 0)
        return [];
    let a = [2];
    let i = 3;
    while (a.length < n) {
        if (isPrime(i)) {
            a.push(i);
        }
        i++;
    }
    return a;

}

var getStrProduct = (str, primes) => {
    let product = 1;
    for (let i = 0; i < str.length; i++) {
        product = product * primes[(str.charCodeAt(i) - 'a'.charCodeAt(0))];
    }
    return product;
}

/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function (strs) {
    // Generate 1st 26 primes, each index corresponds to alphabets from a-z
    let primes = getPrimes(26);
    let map = new Map();
    strs.forEach(str => {
        // Logic: Product of prime numbers is unique
        // Get unique prime product for each word
        let product = getStrProduct(str, primes)
        // If map has the product, add the anagram to existing anagrams
        if (map.has(product)) {
            let val = map.get(product);
            map.set(product, [...val, str]);
        } else {
            map.set(product, [str]);
        }
    })
    return Array.from(map.values());

    // Sorting Method
    // let map = new Map();
    // strs.forEach(str =>{
    //     let sortedStr = str.split('').sort().join('');
    //     if(map.has(sortedStr)){
    //         let val = map.get(sortedStr);
    //         map.set(sortedStr, [...val,str]);
    //     } else {
    //         map.set(sortedStr, [str]);
    //     }
    // })
    // return Array.from(map.values());

};

