# Source https://www.techiedelight.com/find-maximum-length-sub-array-having-given-sum/

import random

Counter1, Counter2, Sum, Array, RandomLen, SubArray, SubArray1 = 0, 0, 0, [], [], [], []

Goal = random.randint(1, 30)

for Counter in range(15):

    RandomLen.append(random.randint(1, 15))

    if RandomLen[Counter] in Array:

        continue

    else:

        Array.append(RandomLen[Counter])

while Counter2 != len(Array) - 1:

    if Sum == 0 and Counter1 != 0:

        Sum += Array[Counter1] + Array[Counter2]

    else:

        Sum += Array[Counter1]

    if Sum > Goal:

        Sum = 0

    elif Sum <= Goal:

        SubArray.append(Array[Counter1])

        if Sum == Goal:

            Sum = 0

    Counter1 += 1

    if Counter1 == len(Array):

        Counter2 += 1

        Counter1 = Counter2

        Sum = 0

print()
print(Array)
print(Goal)
print(SubArray)
