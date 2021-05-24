# Source https://www.techiedelight.com/find-maximum-length-sub-array-having-given-sum/

import random

Counter1, Sum, Array, RandomLen, SubArray = 0, 0, [], [], []

Goal = random.randint(1, 30)

for Counter in range(15):

    RandomLen.append(random.randint(1, 15))

    if RandomLen[Counter] in Array:

        continue

    else:

        Array.append(RandomLen[Counter])

while Counter1 != len(Array):

    if Array[Counter1] < Goal:

        SubArray.append(Array[Counter1])

    Counter1 += 1

print(Array)

print(Goal)

print(SubArray)

# Find the multiples of goal number. can be a way to solve;
