import operator

list = []

a = True

b = 0

c = 0

d = 0

while a == True:

   list.append(b+1)

   if b % 3 == 0:

      print(b)

      d += 1

   elif b % 5 == 0:

      c += 1

      print(c)

   elif b % 3 == 0 and b % 5 == 0:

      print("FizzBuzz")

   else:

      print(b, " Isn't Fizz Nor Buzz")

   if b == 100:

      a = False

   else:

      b += 1

print("Has ", d, " Fizz numbers")

print("Has ", c, " Buzz numbers")