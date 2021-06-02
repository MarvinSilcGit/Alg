# Source https://www.techiedelight.com/find-maximum-length-sub-array-having-given-sum/

import random

Counter1, Counter2, Counter3, Sum, Array, RandomLen, SubArray, SubArray1 = 0, 1, 2, 0, [], [], [], []

Goal = random.randint(1, 30)

for Counter in range(15):

    RandomLen.append(random.randint(1, 15))

    if RandomLen[Counter] in Array:

        continue

    else:

        Array.append(RandomLen[Counter])

while Counter1 != len(Array) - 1:

    if Counter1 + 1 == Counter2:

        Sum = Counter1 + Counter2

    if Sum <= Goal:

        SubArray1.append(Array[Counter2])

        if Sum == Goal:

            Sum = Counter1 + Counter2

    Counter3 += 1

    if Counter3 == len(Array) and Counter2 != len(Array):

        Counter2 += 1

        Counter3 = Counter2 + 1

        Sum = Counter1 + Counter2

    if Counter2 == len(Array) - 1:

        if Sum == Goal:

            while len(SubArray1) != 0:

                SubArray.append(SubArray1.pop(0))

        Counter1 += 1

        Counter2 = Counter1 + 1

        Counter3 = Counter2 + 1

        Sum = 0

        del SubArray1[:]

print()
print(Array)
print(Goal)
print(SubArray)
