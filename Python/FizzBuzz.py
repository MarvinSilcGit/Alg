c5 = 0

d3 = 0

e35 = 0

for b in range(101):

   if b % 3 == 0 and b % 5 == 0 and b != 0:

      print(b, "is Java")

      d3 += 1

      c5 += 1

      e35 += 1

   elif b % 3 == 0:

      d3 += 1

   elif b % 5 == 0:

      c5 += 1

print()

print("Has", d3, "Fizz numbers")

print("Has", c5, "Buzz numbers")

print("Has", e35, "Java numbers")
