from collections import defaultdict

# Step 1: Assigning a prime number to each letter
primes = {
    'a': 2,  'b': 3,  'c': 5,  'd': 7,  'e': 11,  'f': 13, 'g': 17, 
    'h': 19, 'i': 23, 'j': 29, 'k': 31, 'l': 37, 'm': 41, 'n': 43, 
    'o': 47, 'p': 53, 'q': 59, 'r': 61, 's': 67, 't': 71, 'u': 73,
    'v': 79, 'w': 83, 'x': 89, 'y': 97, 'z': 101
}

def get_prime_product(word):
    """
    Computes the unique prime product for a word.
    Each letter is mapped to a prime number, and the product of those primes
    is used as the key for identifying anagrams.
    """
    product = 1
    for char in word:
        product *= primes[char]  # Multiply the prime value of each character
    return product

def group_anagrams_prime(words):
    """
    Groups anagrams by computing a unique prime product for each word.
    """
    anagrams = defaultdict(list)  # Create defaultdict for grouping
    
    for word in words:
        prime_key = get_prime_product(word)  # Compute prime product key
        anagrams[prime_key].append(word)  # Group words with the same key
    
    return list(anagrams.values())  # Return the grouped anagrams as a list


