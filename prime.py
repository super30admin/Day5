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
print(result)  # [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]