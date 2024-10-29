def generate_primes(n):
  primes = []
  num = 2

  while len(primes) < n:
    is_prime = True
    for i in range(2, int(num**0.5) + 1):
      if num % i == 0:
        is_prime = False
        break
    if is_prime:
      primes.append(num)
    num += 1

  return primes

# Example usage:
n = 26
result = generate_primes(n)
print(result)  # Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]