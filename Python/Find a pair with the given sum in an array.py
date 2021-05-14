# Source: https://www.techiedelight.com/find-pair-with-given-sum-array/

import random

array = []

val = []

goal = random.randint(1, 30)

for b in range(15):

    val.append(random.randint(1, 15))

    if val[b] in array:

        continue

    else:

        array.append(val[b])

    print(array)

b = 0

Sum = 0

a = 0

par = []

for b in range(len(array)):

    if array[b] == array[a]:

        continue

    elif a == len(array):

        print(a)

        break

    else:

        if array[b] + array[a] == goal:

            par.append(array[b])

            par.append(array[a])
            print(b)

            print(len(array))
            if len(array) == b:

                b = 0

                a += 1

                print("ss")

                continue

            else:

                continue

        else:

            continue

print(goal)
print(par)