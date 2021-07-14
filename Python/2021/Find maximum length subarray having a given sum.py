# Source https://www.techiedelight.com/find-maximum-length-sub-array-having-given-sum/

import random

Counter1, Counter2, Sum, Array, RandomLen, SubArray = 0, 1, 0, [], [], []

Goal = random.randint(1, 30)

for Counter in range(15):

    RandomLen.append(random.randint(1, 15))

    if RandomLen[Counter] in Array:

        continue

    else:

        Array.append(RandomLen[Counter])

while Counter1 != len(Array) - 1:

    if Array[Counter1] + Array[Counter2] <= sum:

        SubArray.append(Array[Counter2])

    Counter1 += 1

    if Counter1 == len(Array):

        Counter1 += 1

        Counter2 = Counter1 + 1

        Sum = 0

        del SubArray[:]

print()
print(Array)
print(Goal)
print(SubArray)

# 25
# 10 14 15 5 1 4 2 6
# 24
# 2, 6, 10, 9, 11, 15, 12, 13
# Sum the actual number with next number. If the next number minus past number has a value closest, remove the past and add the new one;
