# Source: https://www.techiedelight.com/find-pair-with-given-sum-array/

import random

Counter1, Counter2, Array, val, par = 0, 0, [], [], []

goal = random.randint(1, 30)

for Counter in range(15):

    val.append(random.randint(1, 15))

    if val[Counter] in Array:

        continue

    else:

        Array.append(val[Counter])

print(Array)

while Counter1 != len(Array):

    if Array[Counter1] == Array[Counter1]:

        Counter1 += 1

        continue

    elif Array[Counter1] + Array[Counter2] == goal or Array[Counter1] - Array[Counter2] == goal:

        if Array[Counter2] and Array[Counter1] not in par:

            par.append(Array[Counter1])

            par.append(Array[Counter2])

        else:

            pass

    if Counter1 == len(Array)-1:

        Counter2 += 1

        Counter1 = 0

        continue

    else:

        Counter1 += 1

print(goal)
print(par)
