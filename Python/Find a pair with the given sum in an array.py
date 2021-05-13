# Source: https://www.techiedelight.com/find-pair-with-given-sum-array/

import random

par = []

array = []

Sum = 0

a = 0

d = 10

Sum = random.randint(1, 18)

val = []

for b in range(d):

    val.append(random.randint(1, 5))

    if val[b] in array:

        print(val[b])

        continue

    else:

        array.append(val[b])

    print(array)

print(val)

"""for c in array:

    if array[c] + a == Sum:

        print()
"""