# Source https://www.techiedelight.com/find-maximum-length-sub-array-having-given-sum/

import random

Counter1, Array, RandomLen, SubArray = 0, [], [], []

Goal = random.randint(1, 30)

for Counter in range(15):

    RandomLen.append(random.randint(1, 15))

    if RandomLen[Counter] in Array:

        continue

    else:

        Array.append(RandomLen[Counter])

while Counter1 != len(Array)-1:

    pass

print(Array)

print(Goal)
