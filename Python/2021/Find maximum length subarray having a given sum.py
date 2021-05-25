# Source https://www.techiedelight.com/find-maximum-length-sub-array-having-given-sum/

import random

Counter1, Counter2, Counter3, Sum, Array, RandomLen, SubArray, SubArray1 = 0, 0, 0, 0, [], [], [], []

Goal = random.randint(1, 30)

for Counter in range(15):

    RandomLen.append(random.randint(1, 15))

    if RandomLen[Counter] in Array:

        continue

    else:

        Array.append(RandomLen[Counter])

while Counter2 != len(Array)-1:

    if Array[Counter1] + Sum <= Goal:

        SubArray1.append(Array[Counter1])

        Sum += Array[Counter1]

    Counter1 += 1

    if Counter1 == len(Array) - 1:

        Counter2 += 1

        Counter1 = Counter2

        Sum = 0

        SubArray.append(SubArray1)

        print("aaa", SubArray1)
        print("sss", SubArray)
        print()

        SubArray1.clear()
print()
print(Array)

print(Goal)

print(SubArray)
