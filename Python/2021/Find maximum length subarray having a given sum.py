# Source https://www.techiedelight.com/find-maximum-length-sub-array-having-given-sum/

import random

Counter2, Counter1, Goal, Array = 0, 0, random.randint(3, 20), []

for Counter in range(0, (random.randint(3, 20))):

    Array.append(random.randint(4, 21))

while Counter2 != Goal // 3:

    Counter1 += 1

    if Counter1 == Goal // 3:

        pass

    else:

        Counter2 += 1

print(Array)

print(Goal, " is  present on array", Array)
