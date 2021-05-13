list = []

a = True

b = 0

c = 0

d = 0

e = 0

while a == True:

   list.append(b+1)

   if b % 3 == 0 and b % 5 == 0 and b != 0:

      print(b, "is FizzBuzz")

      d += 1

      c += 1

      e += 1

   elif b % 3 == 0:

      d += 1

   elif b % 5 == 0:

      c += 1

   if b == 100:

      a = False

   else:

      b += 1

print()

print("Has", d, "Fizz numbers")

print("Has", c, "Buzz numbers")

print("Has", e, "FizzBuzz numbers")
