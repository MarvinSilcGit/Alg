# Source: https://www.techiedelight.com/check-subarray-with-0-sum-exists-not/

# Fix the variables names of past files;

import random

SubSet0 = {0}

SubSet1 = {0}

SubSet2 = {0}

MasterSet = {0}

a = 0

max = 15

while a != max/3:

    if not SubSet0.clear():

        SubSet0.remove(0)

    else:

        SubSet0.add(random.randint(-30, 30))

    if not SubSet1.clear():

        SubSet1.remove(0)

    else:

        SubSet1 = random.randint(-30, 30)

    if not SubSet2.clear():

        SubSet2.remove(0)

    else:
        SubSet2 = random.randint(-30, 30)

    a += 1

MasterSet.remove(0)

MasterSet.add(SubSet0)

MasterSet.add(SubSet1)

MasterSet.add(SubSet2)

print(MasterSet)
