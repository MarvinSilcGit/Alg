# Source: https://www.techiedelight.com/check-subarray-with-0-sum-exists-not/

# Fix the variables names of past files;

import random

SubSet0 = {31}

SubSet1 = {31}

SubSet2 = {31}

MasterSet = {31}

a = 0

max = 15

while a != max/3:

    if a == 0:

        SubSet0.clear()

        SubSet1.clear()

        SubSet2.clear()

    else:

        SubSet0.add(random.randint(-30, 30))

        SubSet1.add(random.randint(-30, 30))

        SubSet2.add(random.randint(-30, 30))

    a += 1

MasterSet.remove(31)

MasterSet.add(SubSet0)

MasterSet.add(SubSet1)

MasterSet.add(SubSet2)

print(MasterSet)
