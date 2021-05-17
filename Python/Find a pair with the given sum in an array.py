# Source: https://www.techiedelight.com/find-pair-with-given-sum-array/

import random

array, val, par = [], [], []

goal = random.randint(1, 30)

for b in range(15):

    val.append(random.randint(1, 15))

    if val[b] in array:

        continue

    else:

        array.append(val[b])

print(array)

b, a = 0, 0

while b != len(array):

    if array[b] == array[a]:

        b += 1

        continue

    elif array[b] + array[a] == goal or array[b] - array[a] == goal:

        if array[a] and array[b] not in par:

            par.append(array[b])

            par.append(array[a])

        else:

            pass

    if b == len(array)-1:

        a += 1

        b = 0

        continue

    else:

        b += 1

print(goal)
print(par)
