# Source: https://goalkicker.com/AlgorithmsBook/

Fizz, Buzz, FizzBuzz = 0, 0, 0

for b in range(101):

   if b % 3 == 0 and b % 5 == 0 and b != 0:

      Fizz += 1

      Buzz += 1

      FizzBuzz += 1

   elif b % 3 == 0:

      Fizz += 1

   elif b % 5 == 0:

      Buzz += 1

print("Has", Fizz, "Fizz numbers")

print("Has", Buzz, "Buzz numbers")

print("Has", FizzBuzz, "FizzBuzz numbers")
