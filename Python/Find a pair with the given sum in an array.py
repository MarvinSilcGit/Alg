# Source: https://www.techiedelight.com/find-pair-with-given-sum-array/

import random

array = []

val = []

goal = random.randint(1, 30)

for b in range(15):

    val.append(random.randint(1, 15))

    if val[b] in array:

        continue

    else:

        array.append(val[b])

print(array)

b = 0

Sum = 0

a = 0

par = []

while True:

    if array[b] == array[a]:

        b += 1

        continue

    else:

        if array[b] + array[a] == goal:

            par.append(array[b])

            par.append(array[a])

    if b + 1 == len(array):

        b = 0

        a += 1

    else:

        b += 1

    if a+1 == len(array):

        break

print(par)
