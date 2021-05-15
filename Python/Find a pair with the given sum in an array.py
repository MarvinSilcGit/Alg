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

a = 0

par = []

while b != len(array):

    if array[b] == array[a]:

        b += 1

        continue

    elif array[b] + array[a] == goal:

        #if array[b] and array[a] not in par[0][0]:

        par.append((array[b], array[a]))

    b += 1

    if b == len(array)-1:

        a += 1

        b = 0

print(goal)
print(par)
print(len(par))
